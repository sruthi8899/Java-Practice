import java.util.StringTokenizer;

public class Tokenizer {

	public static void main(String[] args) {
		
		StringTokenizer st = new StringTokenizer("JAVA PYTHON SQL AI");
		
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}

	}

}
