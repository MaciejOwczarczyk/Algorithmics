package pl.coderslab.pluralSight.creational.builder;

public class BuilderDemo {
    public static void main(String[] args) {

        LunchOrderBean lunchOrderBean = new LunchOrderBean();

        lunchOrderBean.setBread("Wheat");
        lunchOrderBean.setCondiments("Lettuce");
        lunchOrderBean.setDressing("Mustard");
        lunchOrderBean.setMeat("Ham");

        System.out.println(lunchOrderBean.getBread());
        System.out.println(lunchOrderBean.getCondiments());
        System.out.println(lunchOrderBean.getDressing());
        System.out.println(lunchOrderBean.getMeat());

        LunchOrderTele lunchOrderTele = new LunchOrderTele("Wheat", "Lettuce", "Mustard", "Ham");

        System.out.println(lunchOrderTele.getBread());
        System.out.println(lunchOrderTele.getCondiments());
        System.out.println(lunchOrderTele.getDressing());
        System.out.println(lunchOrderTele.getMeat());

        LunchOrder.Builder builder = new LunchOrder.Builder();

        builder.bread("wheat").condiments("lettuce").dressing("mustard").meat("turkey");

        LunchOrder lunchOrder = builder.build();

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());

    }
}
