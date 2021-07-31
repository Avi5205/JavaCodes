package com.OOPS.WorkBook;

public class ShapeUtil {
	@SuppressWarnings("static-access")
	public void showShapeInfo(Shape sp) {
		System.out.println("\nType\t:" + sp.getType());
		System.out.println("Length\t:" + sp.getLength());
		System.out.println("Area\t:" + sp.findArea());
		sp.display();
//		sp.getSide();
//		sp.getWidth();
		System.out.println();
		if (sp instanceof Square) {
			Square sq = (Square) sp;
			System.out.println("Side\t:" + sq.getSide());
			sq.display();
		} else if (sp instanceof Rectangle) {
			Rectangle rec = (Rectangle) sp;
			rec.display();
			System.out.println("Width\t:" + rec.getWidth());
		}
	}
}