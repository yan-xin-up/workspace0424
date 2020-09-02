package buzz.xinyan.java.debugText;

import java.util.Arrays;

public class PassValueExer2 {
	public static void main(String[] args) {
		int[] array = { 3, 2, 5, 1, 7 };

		// 调用sort方法，实现从大到小排序
		// 在此处补充代码
		PassValueExer2 exer = new PassValueExer2();
		exer.sort(array);
		// 显示结果
		System.out.println("排序后的结果是：" + Arrays.toString(array));
	}

	// 要求使用冒泡排序完成
	public void sort(int[] array) {// 形参？

		for (int i = 1; i < array.length; i++) { // n-1数字进行排序

			for (int j = 0; j < array.length - i; j++) { // 需要比的次数递减

				if (array[j] < array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}

		}
	}
}
