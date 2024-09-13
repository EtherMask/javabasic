package m_interface.YesInterface;//자동으로 abstract가 들어옴

public interface DBDriver {
	public abstract void connect();//둘다 자동으로 public이 들어옴
	public void insert(); //헷갈릴수있어서 public을 붙이기
}