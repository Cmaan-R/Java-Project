package estruturasDeControle;

public class SwicthSemBreak {
	
		public static void main(String[] args) {
			
		String faixa = "Preta"; //Se colocar faixa branca, cai no BREAK e apenas a mensagem do DEFAULT será executada
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Ssei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian Yodan");
		case "laranja":
			System.out.println("Sei o Heian Sandan");
		case "vermelha":
			System.out.println("Sei o Heian Nidan");
		case "amarela":
			System.out.println("Sei o Heain Shodan");
			break;
		default:
			System.out.println("Não sei de nada");
		
		}
			System.out.println("Fim\n");
			
			int idade = 4;
			switch (idade) {
			
			case 4:
				System.out.println("Sabe programar");
			case 3:
				System.out.println("Sabe falar");
			case 2:
				System.out.println("Sabe andar");
			case 1:
				System.out.println("Sabe Respeirar");
			}
			
			
		}

}
