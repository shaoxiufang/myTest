## 实验四  字符串实验
**一、实验目的**

1、掌握字符串String及其方法的使用

2、掌握异常处理结构

**二、实验要求**

利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能函数，并运行。达到如下功能：
1.	每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”

2.	允许提供输入参数，统计古诗中某个字或词出现的次数

3.	考虑操作中可能出现的异常，在程序中设计异常处理程序

输出：

汉皇重色思倾国，御宇多年求不得。

杨家有女初长成，养在深闺人未识。

天生丽质难自弃，一朝选在君王侧。

回眸一笑百媚生，六宫粉黛无颜色。

春寒赐浴华清池，温泉水滑洗凝脂。

侍儿扶起娇无力，始是新承恩泽时。

云鬓花颜金步摇，芙蓉帐暖度春宵。

春宵苦短日高起，从此君王不早朝。

…………


**三、实验过程**

1、编写一个TestString类，实例化一个StringBuffer对象stringBuffer，在stringBuffer中使用append方法添加字符串“汉皇重色思倾国，御宇多年求............”

2、定义一个空字符string，用于存储格式化的诗句。

3、编写for循环对stringBuffer进行遍历，为其添加判断方法，当字符长度大于7位时，每7个字构成一句诗添加到string中，否则停止循环。当诗句句子数是奇数时，在
string后添加“，”，当诗句句子是偶数时，在string后添加“。\n”.

4、定义count方法，搜索和统计出现某字的个数。使用while语句循环，当字符串长度未越界，当某字出现时,count数量加1,实现计数功能.


5、对for循环添加try,catch对异常进行捕获.


**四、流程图**
 
![图片](https://user-images.githubusercontent.com/57746365/68857309-7e24ac00-071d-11ea-87e7-38d03e51c8b1.png)

![图片](https://user-images.githubusercontent.com/57746365/68857616-1c187680-071e-11ea-83f1-712f81e5d399.png)



**五、核心代码**

1、//编写for循环对stringBuffer进行遍历，为其添加判断方法，当字符长度大于7位时，每7个字构成一句诗添加到string中。当诗句句子数是奇数时，在string后添加
“，”，当诗句句子是偶数时，在string后添加“。\n”.
    
    
    for (int i=0;i< stringBuffer.length(); i++) {
      if (i*7+ 7 > stringBuffer.length()) {      
				    string += stringBuffer.substring(i * 7, stringBuffer.length());
				    break;
				   }
				   //如果古诗句数是奇数
				   if ((i*7)%2==0) {
				    string+=stringBuffer.substring(i*7, i*7+7)+",";
				   } else {
					//如果是偶数
				    string += stringBuffer.substring(i*7, i*7+7)+"。"+"\n";
				   }
           


2、//定义count方法，统计出现的字的个数


		 public static int count(StringBuffer stringBuffer, String select) {
		  int count = 0; int index = 0;
		  while ((index = stringBuffer.indexOf(select, index)) != -1) {
		   index = index + select.length();
		   count++; }
		  return count;

**六、运行截图**

![图片](https://user-images.githubusercontent.com/57746365/68854703-95609b00-0717-11ea-9c1c-395ec3e61199.png)


**七、实验感想**

这次字符串编程，使我对String的方法有了更多的了解，提高了我的思维方式，锻炼了解决实际问题的能力。但这次编写的代码不够简练，我将通过日后的学习不断对代码
进行改进。
