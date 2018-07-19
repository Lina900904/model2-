package domain;

public class ExamBean  {
	private String exam_id, score, sub_seq, record_seq,month,mem_id;

	public String getSub_seq() {
		return sub_seq;
	}

	@Override
	public String toString() {
		return "ExamBean [exam_id=" + exam_id + ", score=" + score + ", sub_seq=" + sub_seq + ", record_seq="
				+ record_seq + ", month=" + month + ", mem_id=" + mem_id + "]";
	}

	public void setSub_seq(String sub_seq) {
		this.sub_seq = sub_seq;
	}

	public String getExam_id() {
		return exam_id;
	}

	public String getMem_id() {
		return mem_id;
	}

	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}

	public void setExam_id(String exam_id) {
		this.exam_id = exam_id;
	}

	public String getScore() {
		return score;
	}



	public void setScore(String score) {
		this.score = score;
	}


	public String getRecord_seq() {
		return record_seq;
	}

	public void setRecord_seq(String record_seq) {
		this.record_seq = record_seq;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}
	
	
}
