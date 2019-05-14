
public class stuff {

		// TODO Auto-generated method stub
		public static void main(String[] args) {
			
			stuff.isASubString("Assadfgadghadbdabdb", 0, "sfg", 0);
			
		
	}
		public static boolean isASubString(String str, int strIndex,
				String target, int targetIndex)
				{
				if(targetIndex >= target.length())
				{
					System.out.println("sagasf");
					return true;
				}
				if(strIndex >= str.length())
				return false;
				return str.charAt(strIndex) == target.charAt(targetIndex) &&
				isASubString(str,strIndex+1, target, targetIndex+1);
				}
}

