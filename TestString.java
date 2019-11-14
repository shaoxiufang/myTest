package stringtest;

public class TestString {
	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer();
		  stringBuffer.append("汉皇重色思倾国御宇多年求不得杨"
		  		+ "家有女初长成养在深闺人未识天生"
		  		+ "丽质难自弃一朝选在君王侧回眸一笑百媚生"
		  		+ "六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿"
		  		+ "扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度"
		  		+ "春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春"
		  		+ "从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇"
		  		+ "侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下"
		  		+ "父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日"
		  		+ "君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行<未完，待续>");
		  String string = "";
		  try {
			  //对stringbuffer进行遍历
			  for (int i=0;i< stringBuffer.length(); i++) {
				  //若i的长度大于stringbuffer的长度,停止遍历
				   if (i*7+ 7 > stringBuffer.length()) {
				    string += stringBuffer.substring(i * 7, stringBuffer.length());
				    break;
				   }
				   //如果古诗是奇数
				   if ((i*7)%2==0) {
				    string+=stringBuffer.substring(i*7, i*7+7)+",";
				   } else {
					//如果是偶数
				    string += stringBuffer.substring(i*7, i*7+7)+"。"+"\n";
				   }
				  }
			
		} catch (Exception e) {
			//抛出异常
			System.out.println("这儿可能错了"+e.toString());
			
		}
		  System.out.println(new StringBuilder(string).toString());
		  String input="国";
		  int count = count(stringBuffer, input);
		  System.out.println(input +  "在其中出现的次数为:"+ count);
		 }
		//定义count方法，统计出现的字的个数
		 public static int count(StringBuffer stringBuffer, String select) {
		  int count = 0;
		  int index = 0;
		  
		  while ((index = stringBuffer.indexOf(select, index)) != -1) {
		   index = index + select.length();
		   count++;
		  }
		  return count;
		 }
		 
		}

			
			
		
			
	

