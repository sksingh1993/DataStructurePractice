package poc;

public class HeighestValuePalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(highestValuePalindrome("092282", 6, 3));
	}

	static String highestValuePalindrome(String s, int n, int k) {
		if (n == 1) {
			return "9";
		}
		int left = 0;
		int right = n - 1;
		int mid = n / 2;
		char[] charArr = s.toCharArray();
		boolean flag = true;
		int count = 0;
		while (left < right) {
			char lChar = s.charAt(left);
			char rChar = s.charAt(right);
			if (lChar != rChar) {
				count++;
			}
			left++;
			right--;

		}
		if (count > k) {
			flag = false;
		} else {

			left = 0;
			right = n - 1;

			while (left < right) {
				char lChar = charArr[left];
				char rChar = charArr[right];
				if (count == 0 && k > 0) {
					if(k>1 && lChar!='9' && rChar!='9') {
						charArr[left] = '9';
						charArr[right] = '9';
						k -= 2;
					}
					
				} else if (k >= count) {
					if (k>count && lChar != '9' && rChar != '9' && lChar==rChar) {
						charArr[left] = '9';
						charArr[right] = '9';
						k -= 2;
					}else if (k>count && lChar != '9' && rChar != '9') {
						charArr[left] = '9';
						charArr[right] = '9';
						k -= 2;
						count--;
					}else if (lChar != rChar) {
						if (rChar > lChar) {
							charArr[left] = rChar;
							count--;
							k--;
						} else if (rChar < lChar) {
							charArr[right] = lChar;
							count--;
							k--;
						}
					}
				} else if (lChar != rChar && k < count) {
					flag = false;
					break;
				}
				left++;
				right--;
			}
			if(k>=1 && n%2!=0 && charArr[n/2]!='9') {
				charArr[n / 2] = '9';
			}

		}
		if (flag) {
			return new String(charArr);
		} else {
			return "-1";
		}

	}
}
