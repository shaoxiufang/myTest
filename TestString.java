package stringtest;

public class TestString {
	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer();
		  stringBuffer.append("������ɫ˼�����������󲻵���"
		  		+ "����Ů���������������δʶ����"
		  		+ "����������һ��ѡ�ھ��������һЦ������"
		  		+ "������������ɫ������ԡ�������Ȫˮ��ϴ��֬�̶�"
		  		+ "��������ʼ���³ж���ʱ���޻��ս�ҡܽ����ů��"
		  		+ "������������ո���Ӵ˾������糯�л���������Ͼ��"
		  		+ "�Ӵ���ҹרҹ�󹬼�����ǧ����ǧ�谮��һ�����ױ�ɽ�"
		  		+ "��ҹ��¥�����ʹ���õ��ֽ���ʿ����������Ż���������"
		  		+ "��ĸ�Ĳ�����������Ů�깬�ߴ����������ַ�Ʈ�����Ż���������˿����"
		  		+ "��������������ܱ�Ķ����������������������س����̳���ǧ������������<δ�꣬����>");
		  String string = "";
		  try {
			  //��stringbuffer���б���
			  for (int i=0;i< stringBuffer.length(); i++) {
				  //��i�ĳ��ȴ���stringbuffer�ĳ���,ֹͣ����
				   if (i*7+ 7 > stringBuffer.length()) {
				    string += stringBuffer.substring(i * 7, stringBuffer.length());
				    break;
				   }
				   //�����ʫ������
				   if ((i*7)%2==0) {
				    string+=stringBuffer.substring(i*7, i*7+7)+",";
				   } else {
					//�����ż��
				    string += stringBuffer.substring(i*7, i*7+7)+"��"+"\n";
				   }
				  }
			
		} catch (Exception e) {
			//�׳��쳣
			System.out.println("������ܴ���"+e.toString());
			
		}
		  System.out.println(new StringBuilder(string).toString());
		  String input="��";
		  int count = count(stringBuffer, input);
		  System.out.println(input +  "�����г��ֵĴ���Ϊ:"+ count);
		 }
		//����count������ͳ�Ƴ��ֵ��ֵĸ���
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

			
			
		
			
	

