package poc;

public class QueenAttack {

	public static void main(String[] args) {
		int n=8;
		int rq=3;
		int cq=7;
		int attacker=14;
		if(cq==0 || rq==0) {
			attacker+=7;
		}else {
			if((rq+cq)<=9) {
				attacker+=2*cq+5;
			}else {
				attacker+=23-2*cq;
			}
		}
		System.out.println(attacker);
	}
	/*
	 * public static boolean isOnDiagonal(int rq,int cq,int ro,int co) {
	 * 
	 * }
	 */
}
