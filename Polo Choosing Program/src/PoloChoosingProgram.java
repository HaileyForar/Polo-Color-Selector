
public class PoloChoosingProgram
	{

		public static void main(String[] args)
			{
				String[] poloColors = new String [5];
				
				poloColors [0] = "Light Blue";
				poloColors [1] = "Navy Blue";
				poloColors [2] = "Gray";
				poloColors [3] = "White";
				poloColors [4] = "Yellow";
				
				System.out.println("Your polo colors are...");
				
				for(String s : poloColors)
					{
						System.out.println(s);
					}
				
				System.out.println("You should wear this polo...");
				
				
				int length = poloColors.length;
				int random = (int) (Math.random() * length);
				System.out.println(poloColors[random]);
				

			}

	}
