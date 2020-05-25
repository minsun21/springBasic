package spring.com.aop.entity;

public class SpringExam implements Exam {

	private int kor;
	private int eng;
	private int math;
	private int com;

	public SpringExam() {
	}

	public SpringExam(int kor, int eng, int math, int com) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.com = com;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	@Override
	public int total() {
		// 모든 업무
//		long start = System.currentTimeMillis();
//		int result= kor + eng + math + com;
//		
//		try {
//			Thread.sleep(200);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		long end = System.currentTimeMillis();
//		String message = end-start +"ms";
//		System.out.println("시간은 " +message);
		
		int result= kor + eng + math + com;
		return result;
	}

	@Override
	public float avg() {
		return total() / 4.0f;
	}

	@Override
	public String toString() {
		return "springExam [kor=" + kor + ", eng=" + eng + ", math=" + math + ", com=" + com + "]";
	}

}
