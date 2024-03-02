import java.util.HashMap;
import java.util.Map;

public class DuplicateStringUsingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="laptopgfdhsfhsfhsf";
		char[] ch=s.toCharArray();
		
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		int count=1;
		for(int i=0;i<ch.length;i++)
		{
			if(!map.containsKey(ch[i]))
			{
				map.put(ch[i],count);
			}
			else
			{
				map.put(ch[i],map.get(ch[i])+1);
			}
		}
		for(Character x:map.keySet())
		{
			if(map.get(x)>1)
			{
		 System.out.println(x+"="+map.get(x));
			
			}
			
		}
				{
			
				}
		

	}

}
