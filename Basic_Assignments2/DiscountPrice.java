
public class DiscountPrice {
	public float discount(float newItem){
		float temp = newItem;
		float discount = 0.35f;
		float offer = newItem*discount;
		float newItemPrice = temp - offer;
		System.out.println(newItemPrice);
		return newItemPrice;
	}
}
