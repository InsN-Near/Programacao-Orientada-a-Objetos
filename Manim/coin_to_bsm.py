from manim import *
import numpy as np

# Configurações Globais (opcional, mas útil para consistência)
# TexTemplate.add_to_preamble(r"\usepackage{amsmath}") # Já incluído por padrão em versões recentes

class CoinToBSM(Scene):
    def construct(self):
        # Título Geral
        title = Text("Da Moeda ao Black-Scholes-Merton, por Nicolas", font_size=40)
        self.play(Write(title))
        self.wait(1)
        self.play(title.animate.to_edge(UP))

        # --- Estágio 1: Lançamento de Moeda Simples ---
        stage1_title = Text("1. Lançamento de Moeda (Processo de Bernoulli)", font_size=32).next_to(title, DOWN, buff=0.5)
        self.play(Write(stage1_title))

        # Moeda (simulada)
        coin = Circle(radius=0.5, color=YELLOW, fill_opacity=0.8).shift(LEFT*3)
        heads_text = Text("Cara (Sobe)", font_size=24).next_to(coin, UP, buff=0.3)
        tails_text = Text("Coroa (Desce)", font_size=24).next_to(coin, DOWN, buff=0.3)

        # Fórmulas
        prob_p = MathTex("P(\text{Cara}) = p").next_to(heads_text, RIGHT, buff=0.5)
        prob_1_p = MathTex("P(\text{Coroa}) = 1-p").next_to(tails_text, RIGHT, buff=0.5)
        
        # Preço do ativo
        s0_text = MathTex("S_0").move_to(coin.get_center() + LEFT*2)
        s_up = MathTex("S_0 u").next_to(s0_text, UR)
        s_down = MathTex("S_0 d").next_to(s0_text, DR)
        arrow_up = Arrow(s0_text.get_right(), s_up.get_left(), buff=0.1, color=GREEN)
        arrow_down = Arrow(s0_text.get_right(), s_down.get_left(), buff=0.1, color=RED)

        self.play(
            Create(coin),
            Write(heads_text), Write(tails_text),
            Write(prob_p), Write(prob_1_p)
        )
        self.wait(2)
        self.play(
            Transform(coin, s0_text), # Transforma a moeda no S0
            FadeOut(heads_text), FadeOut(tails_text),
            FadeOut(prob_p), FadeOut(prob_1_p),
            Create(arrow_up), Create(arrow_down),
            Write(s_up), Write(s_down)
        )
        self.wait(2)
        
        stage1_elements = VGroup(coin, arrow_up, arrow_down, s_up, s_down, stage1_title)
        self.play(FadeOut(stage1_elements))

        # --- Estágio 2: Árvore Binomial (Pequena) ---
        stage2_title = Text("2. Árvore Binomial (Múltiplos Passos)", font_size=32).next_to(title, DOWN, buff=0.5)
        self.play(Write(stage2_title))

        # Parâmetros da árvore
        S0_val = 100
        u = 1.1
        d = 0.9
        n_steps_small = 2

        # Posições iniciais
        nodes_small = {}
        nodes_small[0,0] = Dot(LEFT * 4, color=BLUE)
        label_s0 = MathTex(f"S_0").next_to(nodes_small[0,0], LEFT, buff=0.2)

        tree_small_elements = VGroup(nodes_small[0,0], label_s0)
        self.play(Create(nodes_small[0,0]), Write(label_s0))

        # Construindo a árvore pequena
        for i in range(1, n_steps_small + 1):
            for j in range(i + 1):
                k = j # número de subidas
                num_downs = i - k
                node_pos = LEFT * (4 - i*2) + UP * (k - num_downs) * 0.7
                nodes_small[i,k] = Dot(node_pos, color=BLUE)
                label_val = S0_val * (u**k) * (d**num_downs)
                # label_node = MathTex(f"S_{i},{k}").scale(0.7).next_to(nodes_small[i,k], RIGHT if i==n_steps_small else DOWN, buff=0.1)
                label_node = MathTex(f"{label_val:.1f}").scale(0.7).next_to(nodes_small[i,k], RIGHT, buff=0.1)


                tree_small_elements.add(nodes_small[i,k], label_node)
                
                # Linhas de conexão
                if k <= i-1: # Conexão com nó abaixo no passo anterior (d)
                    line_down = Line(nodes_small[i-1,k].get_center(), nodes_small[i,k].get_center(), stroke_width=2, color=RED)
                    tree_small_elements.add(line_down)
                    self.play(Create(line_down), Create(nodes_small[i,k]), Write(label_node), run_time=0.5)
                if k > 0 : # Conexão com nó acima no passo anterior (u)
                    line_up = Line(nodes_small[i-1,k-1].get_center(), nodes_small[i,k].get_center(), stroke_width=2, color=GREEN)
                    tree_small_elements.add(line_up)
                    self.play(Create(line_up), Create(nodes_small[i,k]), Write(label_node), run_time=0.5)
        
        # Fórmulas da árvore binomial
        u_formula = MathTex("u = e^{\sigma \sqrt{\Delta t}}").scale(0.8)
        d_formula = MathTex("d = e^{-\sigma \sqrt{\Delta t}} = 1/u").scale(0.8)
        q_formula = MathTex("q = \\frac{e^{r \Delta t} - d}{u - d}").scale(0.8) # Probabilidade risco-neutro
        
        formulas_binomial = VGroup(u_formula, d_formula, q_formula).arrange(DOWN, buff=0.3).to_edge(RIGHT).shift(UP*0.5)
        self.play(Write(formulas_binomial))
        self.wait(3)
        
        self.play(FadeOut(tree_small_elements), FadeOut(formulas_binomial), FadeOut(stage2_title))

        # --- Estágio 3: Aumento de Passos e Convergência ---
        stage3_title = Text("3. Muitos Passos: $\Delta t \\to 0, N \\to \infty$", font_size=32).next_to(title, DOWN, buff=0.5)
        self.play(Write(stage3_title))

        # Mostrar uma árvore maior (esquemática)
        # Parâmetros da árvore
        n_steps_large = 5 # Para visualização, não muito grande
        root_pos = LEFT * 5 + DOWN * 1
        
        nodes = {}
        labels = {}
        lines = VGroup()

        # Nó inicial
        nodes[0,0] = Dot(root_pos, color=BLUE)
        labels[0,0] = MathTex("S_0").scale(0.7).next_to(nodes[0,0], LEFT, buff=0.1)
        
        large_tree_visual = VGroup(nodes[0,0], labels[0,0])

        # Gerar nós e linhas
        x_spacing = 1.8
        y_scaling = 0.5 # Ajustar para a densidade vertical
        
        for i in range(1, n_steps_large + 1):
            for k in range(i + 1): # k é o número de subidas
                num_downs = i - k
                node_x = root_pos[0] + i * x_spacing
                node_y = root_pos[1] + (k - num_downs) * y_scaling * (n_steps_large / i)**0.5 # Tentativa de manter a largura
                
                nodes[i,k] = Dot(np.array([node_x, node_y, 0]), color=BLUE, radius=0.05 + 0.05*(n_steps_large-i)/n_steps_large)
                large_tree_visual.add(nodes[i,k])

                if k <= i-1: # Veio de um movimento 'd'
                    lines.add(Line(nodes[i-1,k].get_center(), nodes[i,k].get_center(), stroke_width=1.5, color=RED))
                if k > 0: # Veio de um movimento 'u'
                    lines.add(Line(nodes[i-1,k-1].get_center(), nodes[i,k].get_center(), stroke_width=1.5, color=GREEN))
        
        self.play(Create(large_tree_visual), Create(lines), run_time=2)
        self.wait(1)

        # Mostrar alguns caminhos aleatórios na árvore
        path1_nodes_indices = [(0,0), (1,1), (2,1), (3,2), (4,2), (5,3)] # Exemplo de caminho
        path2_nodes_indices = [(0,0), (1,0), (2,1), (3,1), (4,0), (5,0)] # Exemplo de caminho

        def get_path_vgroup(node_indices_list, nodes_dict, color):
            path_lines = VGroup()
            path_dots = VGroup()
            for idx in range(len(node_indices_list) - 1):
                start_node = nodes_dict[node_indices_list[idx]]
                end_node = nodes_dict[node_indices_list[idx+1]]
                path_lines.add(Line(start_node.get_center(), end_node.get_center(), color=color, stroke_width=4))
                if idx == 0: path_dots.add(Dot(start_node.get_center(), color=color, radius=0.1))
                path_dots.add(Dot(end_node.get_center(), color=color, radius=0.1))
            return VGroup(path_lines, path_dots)

        path1_viz = get_path_vgroup(path1_nodes_indices, nodes, YELLOW)
        path2_viz = get_path_vgroup(path2_nodes_indices, nodes, ORANGE)

        self.play(LaggedStart(
            Create(path1_viz),
            Create(path2_viz),
            lag_ratio=0.5
        ), run_time=3)
        self.wait(2)

        converge_text = Text("Converge para Caminhos Aleatórios Contínuos", font_size=28).to_edge(DOWN)
        self.play(Write(converge_text))
        self.wait(2)

        all_stage3_elements = VGroup(stage3_title, large_tree_visual, lines, path1_viz, path2_viz, converge_text)
        self.play(FadeOut(all_stage3_elements))

        # --- Estágio 4: Movimento Browniano Geométrico (GBM) ---
        stage4_title = Text("4. Movimento Browniano Geométrico (GBM)", font_size=32).next_to(title, DOWN, buff=0.5)
        self.play(Write(stage4_title))
        
        # Animação de caminhos aleatórios (GBM)
        axes = Axes(
            x_range=[0, 10, 2],
            y_range=[0, 4, 1], # Ajustar conforme a simulação
            x_length=6,
            y_length=4,
            axis_config={"include_tip": False, "include_numbers": True},
            x_axis_config={"font_size":20},
            y_axis_config={"font_size":20}
        ).to_edge(LEFT, buff=1).shift(DOWN*0.5)
        x_label = axes.get_x_axis_label("t").scale(0.8)
        y_label = axes.get_y_axis_label("S_t").scale(0.8)
        
        self.play(Create(axes), Write(x_label), Write(y_label))

        # Simular e desenhar alguns caminhos GBM
        S0_gbm = 1.0
        mu_gbm = 0.1 # Drift
        sigma_gbm = 0.3 # Volatilidade
        T_gbm = 10
        n_points = 100
        dt_gbm = T_gbm / n_points

        paths_gbm = VGroup()
        num_paths_to_show = 3
        colors_gbm = [BLUE, GREEN, YELLOW]

        for i in range(num_paths_to_show):
            path_points = [axes.coords_to_point(0, S0_gbm)]
            current_S = S0_gbm
            for _ in range(n_points):
                dW = np.random.normal(0, np.sqrt(dt_gbm))
                dS = mu_gbm * current_S * dt_gbm + sigma_gbm * current_S * dW
                current_S += dS
                if current_S < 0: current_S = 0 # Absorbing barrier at 0
                path_points.append(axes.coords_to_point(_ * dt_gbm, current_S))
            
            path_graph = VMobject(color=colors_gbm[i % len(colors_gbm)])
            path_graph.set_points_as_corners(path_points)
            paths_gbm.add(path_graph)

        self.play(LaggedStart(*[Create(p) for p in paths_gbm], lag_ratio=0.7), run_time=4)
        
        # Fórmula SDE do GBM
        gbm_sde = MathTex(r"dS_t = \mu S_t dt + \sigma S_t dW_t", font_size=36)
        gbm_sde.next_to(axes, RIGHT, buff=0.5).shift(UP*0.5)
        
        # Explicação dos termos
        mu_text = MathTex(r"\mu: \text{Drift (taxa de retorno esperada)}").scale(0.7).next_to(gbm_sde, DOWN, buff=0.3, aligned_edge=LEFT)
        sigma_text = MathTex(r"\sigma: \text{Volatilidade (risco)}").scale(0.7).next_to(mu_text, DOWN, buff=0.2, aligned_edge=LEFT)
        dW_text = MathTex(r"dW_t: \text{Incremento Wiener (aleatoriedade)}").scale(0.7).next_to(sigma_text, DOWN, buff=0.2, aligned_edge=LEFT)
        
        self.play(Write(gbm_sde))
        self.wait(1)
        self.play(Write(mu_text))
        self.play(Write(sigma_text))
        self.play(Write(dW_text))
        self.wait(3)

        all_stage4_elements = VGroup(stage4_title, axes, x_label, y_label, paths_gbm, gbm_sde, mu_text, sigma_text, dW_text)
        self.play(FadeOut(all_stage4_elements))

        # --- Estágio 5: Modelo Black-Scholes-Merton ---
        stage5_title = Text("5. Modelo Black-Scholes-Merton (BSM)", font_size=32).next_to(title, DOWN, buff=0.5)
        self.play(Write(stage5_title))

        bsm_intro = Text(
            "Baseado no GBM e na ausência de arbitragem,\n"
            "chegamos à fórmula de precificação de opções:",
            font_size=28, t2w={'GBM': BOLD, 'ausência de arbitragem': BOLD}
        ).next_to(stage5_title, DOWN, buff=0.4)
        self.play(Write(bsm_intro))
        self.wait(2)

        # Fórmula BSM para uma Call Option
        call_formula_l1 = MathTex(r"C(S_t, t) = S_t N(d_1) - K e^{-r(T-t)} N(d_2)", font_size=32)
        d1_formula = MathTex(r"d_1 = \frac{\ln(S_t/K) + (r + \sigma^2/2)(T-t)}{\sigma \sqrt{T-t}}", font_size=30)
        d2_formula = MathTex(r"d_2 = d_1 - \sigma \sqrt{T-t}", font_size=30)

        bsm_formulas = VGroup(call_formula_l1, d1_formula, d2_formula).arrange(DOWN, buff=0.35, aligned_edge=LEFT)
        bsm_formulas.next_to(bsm_intro, DOWN, buff=0.5).scale(0.9)
        
        # Para garantir que caiba, centralizar se necessário
        bsm_formulas.move_to(ORIGIN + DOWN * 0.5) # Ajustar posição final
        
        self.play(Write(call_formula_l1))
        self.wait(0.5)
        self.play(Write(d1_formula))
        self.wait(0.5)
        self.play(Write(d2_formula))
        self.wait(1)
        
        # Explicação dos termos BSM
        params_title = Text("Onde:", font_size=24).next_to(bsm_formulas, DOWN, buff=0.5, aligned_edge=LEFT)
        params_list = VGroup(
            MathTex(r"S_t: \text{Preço atual do ativo}", font_size=20),
            MathTex(r"K: \text{Preço de exercício (Strike)}", font_size=20),
            MathTex(r"T-t: \text{Tempo até o vencimento}", font_size=20),
            MathTex(r"r: \text{Taxa de juros livre de risco}", font_size=20),
            MathTex(r"\sigma: \text{Volatilidade do ativo}", font_size=20),
            MathTex(r"N(\cdot): \text{CDF da Normal Padrão}", font_size=20)
        ).arrange(DOWN, buff=0.15, aligned_edge=LEFT).next_to(params_title, DOWN, buff=0.2, aligned_edge=LEFT)

        # Ajustar posição se sair da tela
        explanation_group = VGroup(params_title, params_list)
        if explanation_group.get_bottom()[1] < -3.5: # Se estiver muito para baixo
            explanation_group.scale(0.9).next_to(bsm_formulas, RIGHT, buff=0.5)
            bsm_formulas.to_edge(LEFT, buff=0.5) # Reajustar fórmulas
        else:
             explanation_group.next_to(bsm_formulas, DOWN, buff=0.3, aligned_edge=LEFT)


        self.play(Write(params_title))
        self.play(LaggedStart(*[Write(p) for p in params_list], lag_ratio=0.2), run_time=3)
        self.wait(5)

        # Final
        final_text = Text("Uma jornada da simples moeda à complexa finança!", color=YELLOW, font_size=30)
        final_text.to_edge(DOWN, buff=0.5)
        self.play(
            FadeOut(bsm_intro), FadeOut(bsm_formulas), FadeOut(explanation_group), FadeOut(stage5_title),
            FadeIn(final_text)
        )
        self.wait(3)
        self.play(FadeOut(final_text), FadeOut(title))
        self.wait(1)