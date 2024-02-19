public class BitShiftOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short a = (short)0x55ff;
		short b = (short)0x00ff;
		// bit operation
		System.out.println("[비트 연산 결과");
		System.out.printf("%04x\n", (short)a & b); // bit AND
		System.out.printf("%04x\n", (short)a | b); // bit OR
		System.out.printf("%04x\n", (short)a ^ b); // bit XOR
		System.out.printf("%04x\n", (short)~a); // bit NOT
		
		
		byte c = 20; // 0x14
		byte d= -8; // 0xf8
		// shift operation
		System.out.println("[시프트 연산 결과");
		System.out.println(c << 2); // c를 왼쪽으로 shift
		System.out.println(c >> 2); // c를 오른쪽으로 shift. 0삽입
		System.out.println(d >> 2); // d를 오른쪽으로 shift. 1삽입
		System.out.printf("%x\n",(d >>> 2)); // d를 2비트 오른쪽으로 시프트. 0삽입
	}

}
