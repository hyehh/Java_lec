package cm.javalec.base;

public class StoreShop1 extends StoreHQ {

	@Override
	public void orderKim() {
		// TODO Auto-generated method stub
		System.out.println("김치찌개 : 4,500원");
	}

	// 안쓰더라도 삭제하면 안됨! 이미 상속으로 이루어졌기 때문에!
	@Override
	public void orderBu() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void orderBi() {
		// TODO Auto-generated method stub

	}

}
