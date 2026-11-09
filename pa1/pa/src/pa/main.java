package pa;

	import javax.swing.JOptionPane;
	import java.util.Random;
	public class main {
	    public static void main(String[] args) {
	       
	    	
	    	        String[] nomes = new String[50];
	    	        int[] pontos = new int[50];
	    	        int jogadores = 0;
	    	        
	    	        boolean replay = true;

	    	        while (replay) {
	    	            
	    	            String nome = JOptionPane.showInputDialog("Digite seu nome:");
	    	            int[] pontuacao = new int[1];

	    	            int vitorias = 0;
	    	            int derrotas = 0;

	    	            for (int r = 1; r <= 3; r++) {
	    	                String escolhaStr = JOptionPane.showInputDialog(
	    	                    "=== FASE 1 (Rodada " + r + "/3) ===\n" +
	    	                    "Escolha:\n1 - Pedra\n2 - Papel\n3 - Tesoura"
	    	                );

	    	                if (escolhaStr == null) return; 
	    	                int usuario = Integer.parseInt(escolhaStr);
	    	                int pc = new Random().nextInt(3) + 1;

	    	              
	    	                String nomeUsuario = "";
	    	                String nomePc = "";

	    	                switch (usuario) {
	    	                    case 1: nomeUsuario = "Pedra"; break;
	    	                    case 2: nomeUsuario = "Papel"; break;
	    	                    case 3: nomeUsuario = "Tesoura"; break;
	    	                }
	    	                switch (pc) {
	    	                    case 1: nomePc = "Pedra"; break;
	    	                    case 2: nomePc = "Papel"; break;
	    	                    case 3: nomePc = "Tesoura"; break;
	    	                }

	    	               
	    	                if (usuario == pc) {
	    	                    JOptionPane.showMessageDialog(null, "Empate! Ambos escolheram " + nomeUsuario);
	    	                    r--; 
	    	                } else if ((usuario == 1 && pc == 3) || (usuario == 2 && pc == 1) || (usuario == 3 && pc == 2)) {
	    	                    vitorias++;
	    	                    pontuacao[0] += 15;
	    	                    JOptionPane.showMessageDialog(null, "Você ganhou a rodada!\nVocê: " + nomeUsuario + " | PC: " + nomePc);
	    	                } else {
	    	                    derrotas++;
	    	                    JOptionPane.showMessageDialog(null, "Computador ganhou!\nVocê: " + nomeUsuario + " | PC: " + nomePc);
	    	                }

	    	                if (vitorias == 2 || derrotas == 2) break;
	    	            }

	    	         
	    	            if (vitorias < 2) {
	    	                JOptionPane.showMessageDialog(null, "Fim de jogo! Você não venceu 2 rodadas na Fase 1[cite: 1].");
	    	            } else {
	    	                JOptionPane.showMessageDialog(null, "Passou para a Fase 2! Pontos: " + pontuacao[0]);

	    	             
	    	                int pontos2 = 0;

	    	                String r1 = JOptionPane.showInputDialog("FASE 2 (1/5)\nQual comando exibe mensagem no JOptionPane?\n1) System.out\n2) JOptionPane.showMessageDialog\n3) Scanner");
	    	                if (r1 != null && r1.equals("2")) pontos2 += 15;

	    	                String r2 = JOptionPane.showInputDialog("FASE 2 (2/5)\nQual estrutura usamos para desvios condicionais simples?\n1) if / else\n2) switch\n3) array");
	    	                if (r2 != null && r2.equals("1")) pontos2 += 15;

	    	                String r3 = JOptionPane.showInputDialog("FASE 2 (3/5)\nComo declarar um array de inteiros?\n1) int[] v = new int[5];\n2) int v = 5;\n3) string v[];");
	    	                if (r3 != null && r3.equals("1")) pontos2 += 15;

	    	                String r4 = JOptionPane.showInputDialog("FASE 2 (4/5)\nPara que serve o switch-case?\n1) Repetir código\n2) Múltiplas escolhas\n3) Ler dados");
	    	                if (r4 != null && r4.equals("2")) pontos2 += 15;

	    	                String r5 = JOptionPane.showInputDialog("FASE 2 (5/5)\nQual operador representa 'E' (AND) lógico?\n1) ||\n2) &&\n3) !");
	    	                if (r5 != null && r5.equals("2")) pontos2 += 15;

	    	                pontuacao[0] += pontos2;

	    	              
	    	                if (pontuacao[0] < 60) {
	    	                    JOptionPane.showMessageDialog(null, "Fim de jogo! Você fez " + pontuacao[0] + " pontos. O mínimo para a Fase 3 é 60[cite: 1].");
	    	                } else {
	    	                    JOptionPane.showMessageDialog(null, "Passou para a Fase 3! Pontuação: " + pontuacao[0]);

	    	                
	    	                    int pontosF3 = 0;

	    	                    String[] quest3 = {
	    	                        "FASE 3 (1/10)\nQual é o Pokémon inicial do tipo Elétrico mais famoso?\n1) Charmander\n2) Pikachu\n3) Squirtle",
	    	                        "FASE 3 (2/10)\nQual pokémon é conhecido como o número 1 da Pokédex?\n1) Bulbasaur\n2) Pikachu\n3) Mewtwo",
	    	                        "FASE 3 (3/10)\nDe que tipo é o Pokémon Charizard?\n1) Água/Voador\n2) Fogo/Voador\n3) Grama/Veneno",
	    	                        "FASE 3 (4/10)\nQual item é usado para capturar pokémons?\n1) Poção\n2) Pokébola\n3) Corda do Fuga",
	    	                        "FASE 3 (5/10)\nQual é a evolução do Eevee do tipo Água?\n1) Jolteon\n2) Flareon\n3) Vaporeon",
	    	                        "FASE 3 (6/10)\nQuem é o parceiro fiel e principal do Ash Ketchum?\n1) Pikachu\n2) Meowth\n3) Psyduck",
	    	                        "FASE 3 (7/10)\nQual pokémon lendário é um pássaro de fogo?\n1) Articuno\n2) Zapdos\n3) Moltres",
	    	                        "FASE 3 (8/10)\nQual o tipo forte contra pokémons do tipo Planta?\n1) Fogo\n2) Água\n3) Elétrico",
	    	                        "FASE 3 (9/10)\nQual é o nome da região onde se passa a primeira geração (Kanto)?\n1) Johto\n2) Kanto\n3) Hoenn",
	    	                        "FASE 3 (10/10)\nQual pokémon é famoso por dormir o tempo todo bloqueando a estrada?\n1) Snorlax\n2) Jigglypuff\n3) Gengar"
	    	                    };

	    	                    String[] res3 = {"2", "1", "2", "2", "3", "1", "3", "1", "2", "1"};

	    	                    for (int i = 0; i < quest3.length; i++) {
	    	                        String resp = JOptionPane.showInputDialog(res3[i] + "\nDigite 1, 2 ou 3:");
	    	                        if (resp != null && resp.equals(res3[i])) {
	    	                            pontosF3 += 15;
	    	                        }
	    	                    }

	    	                    pontuacao[0] += pontosF3;
	    	                    JOptionPane.showMessageDialog(null, "Fim de jogo, " + nome + "! Sua pontuação final foi: " + pontuacao[0] + " pontos[cite: 1].");
	    	                }
	    	            }

	    	          
	    	            nomes[jogadores] = nome;
	    	            pontosTotais[jogadores] = pontuacao[0];
	    	            jogadores++;

	    	         
	    	            String ranking = "=== RANKING GERAL ===\n";
	    	            for (int i = 0; i < jogadores; i++) {
	    	                ranking += (i + 1) + ". " + nomes[i] + " - " + pontos[i] + " pts\n";
	    	            }
	    	            JOptionPane.showMessageDialog(null, ranking);
	    	          
	    	            int novo = JOptionPane.showConfirmDialog(null, "Deseja jogar outra partida?", "Reiniciar", JOptionPane.YES_NO_OPTION);
	    	            if (novo != JOptionPane.YES_OPTION) {
	    	                replay = false;
	    	            }
	    	        }
	    	        
	    	        JOptionPane.showMessageDialog(null, "Até mais!");
	    	    }
	    	}
	    	
	    	
	    	
	    
