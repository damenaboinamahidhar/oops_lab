class retail_shop
{
public static void main (String args[])
{
long Invoice_ID=202401005L;
int product_ID=37789;
float product_cost=4444.99f;
int quantity=2;
float discount=0.2f;
double Total_price=(product_cost*quantity)*(1-discount);
boolean feedback=true;
System.out.println("INVOICE ID is:"+Invoice_ID);
System.out.println("PRODUCT ID is:"+product_ID);
System.out.println("PRODUCT COST is:"+product_cost);
System.out.println("NUMBER OF ITEMS is:"+quantity);
System.out.println("TOTAL PRICE is :"+Total_price);
System.out.println("IS FEEDBACK GIVEN :"+feedback);
}
}
