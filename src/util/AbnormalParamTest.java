package util;

public class AbnormalParamTest {
	/*
	 * 这个类的方法用于进行接口健壮性测试（入参赋予异常值），其中main（）方法用于测试，核心方法是getAbnormalParamUrl()
	 */

	private String[] completeUrl;// 拼接完成的url
	private String[] abnormalParamList = { "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "_", "+", "~", "`", "-",
			"=" };// 共16种异常值
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] value={{7,12},{39,79},{48,33},{0,98}};
		AbnormalParamTest test = new AbnormalParamTest();
		// 通过数组的方式传入入参列表
		String[] paramTest = { "a", "pm", "v", "lasttime"};// 定义输入参数的数组
		int[] paramTypeTest = {0,1,0,0};
		// 调用方法，得到一个拼接完成的url数组

		String[] stringTest2 = test.getAbnormalParamUrl(
				"http://news.app.autohome.com.cn/fastnews_v7.3.0/news/LiveTips.ashx?", paramTest, paramTypeTest,value, "ashx", 15);
		// 遍历数组
		for (String str : stringTest2) {
			System.out.println(str);
		}

	}

	/**
	 * 
	 * @param url
	 * 要求传入不加参数的url，例如："http://xxx/v1/opA.ashx?"或"http://xxx/v1/opA"
	 * @param paramList
	 * 传入一个数组，数组的每个元素都是期望传入的入参
	 * @param paramType
	 * 传入一个数组，每一个元素都代表入参的数据类型
	 * 0代表字符串，1代表整型
	 * @param value
	 * 传入一个二维数组，每个外层元素里包含着每个入参的最小值和最大值，字符串类型都为空。
	 * 例如：{{min,max},{min,max},{min,max},{min,max}}
	 * @param urlType
	 * 共有三种url的拼接方式，通过此参数进行选择："ashx"、"json"、"html" 其中，
	 *            若选择ashx，则拼接完成形如：http://xxx/v1/opA.ashx?a=1&b=2
	 *            若选择json，则拼接完成形如：http://xxx/v1/opA-a1-b2.json
	 *            若选择html，则拼接完成形如：http://xxx/v1/opA-a1-b2.html
	 * @param num
	 * 规定方法本次返回的url数量
	 * @return
	 */
	public String[] getAbnormalParamUrl(String url, String[] paramList, int[] paramType,int value[][], String urlType, int num) {
		
		completeUrl = new String[num];
		for (int j = 0; j < num; j++) {
			String paramBind = "";
			for (int i = 0; i < paramList.length; i++) {
				switch (urlType) {
				case "ashx":
					if (i < paramList.length - 1) {
						if (paramType[i] == 0) {
							paramBind = paramBind + paramList[i] + "=" + randomAbnormalValue() + "&";
						} else if (paramType[i] == 1) {
							paramBind = paramBind + paramList[i] + "=" + randomAbnormalValue(value[i][0],value[i][1]) + "&";
						}

					} else {
						if (paramType[i] == 0) {
							paramBind = paramBind + paramList[i] + "=" + randomAbnormalValue();
						} else if (paramType[i] == 1) {
							paramBind = paramBind + paramList[i] + "=" + randomAbnormalValue(value[i][0],value[i][1]);
						}

					}

					break;
				case "json":
					if (i < paramList.length - 1) {
						if (paramType[i] == 0) {
							paramBind = paramBind + "-" + paramList[i] + randomAbnormalValue();
						} else if (paramType[i] == 1) {
							paramBind = paramBind + "-" + paramList[i] + randomAbnormalValue(value[i][0],value[i][1]);
						}

					} else {
						if (paramType[i] == 0) {
							paramBind = paramBind + "-" + paramList[i] + randomAbnormalValue() + ".json";
						} else if (paramType[i] == 1) {
							paramBind = paramBind + "-" + paramList[i] + randomAbnormalValue(value[i][0],value[i][1]) + ".json";
						}

					}

					break;
				case "html":
					if (i < paramList.length - 1) {
						if (paramType[i] == 0) {
							paramBind = paramBind + "-" + paramList[i] + randomAbnormalValue();
						} else if (paramType[i] == 1) {
							paramBind = paramBind + "-" + paramList[i] + randomAbnormalValue(value[i][0],value[i][1]);
						}

					} else {
						if (paramType[i] == 0) {
							paramBind = paramBind + "-" + paramList[i] + randomAbnormalValue() + ".html";
						} else if (paramType[i] == 1) {
							paramBind = paramBind + "-" + paramList[i] + randomAbnormalValue(value[i][0],value[i][1]) + ".html";
						}

					}
					break;
				default:
					break;
				}

			}
			completeUrl[j] = url + paramBind;
		}

		return completeUrl;
	}

	/**           
	 * @return 返回字符串类型的异常值
	 */
	private String randomAbnormalValue() {
		String value = abnormalParamList[(int) ((Math.random() * 100) % 16)];// 随机数可以取到0~15
		return value;
	}
	
	/**
	 * 
	 * @param intValMin 规定产生整型异常值的最小值
	 * @param intValMax 规定产生整型异常值的最大值
	 * @return 返回整型类型的异常值
	 */
	private int randomAbnormalValue(int intValMin,int intValMax) {
		int value  = ((int) (Math.random() * 100)%intValMax+intValMin);
		return value;
	}
}
