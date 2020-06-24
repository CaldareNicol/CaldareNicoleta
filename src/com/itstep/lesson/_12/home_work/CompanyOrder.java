package com.itstep.lesson._12.home_work;


import java.util.List;

public class CompanyOrder extends AbstractOrder{
    private Company company;
    //    private long orderId;

    public CompanyOrder(long orderId, List<Item> orderItem) {
        super(orderId, orderItem);
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

//    private List<Item> companyItem;

//    public CompanyOrder(long orderId, Company company, List<Item> companyItem) {
//        this.orderId = orderId;
//        this.company = company;
//        this.companyItem = companyItem;
//    }
//
//    public long getOrderId() {
//        return orderId;
//    }
//
//    public void setOrderId(long orderId) {
//        this.orderId = orderId;
//    }



//    public List<Item> getCompanyItem() {
//        return companyItem;
//    }
//
//    public void setCompanyItem(List<Item> companyItem) {
//        this.companyItem = companyItem;
//    }
//
//    List<Item> filteredByType(Type type) {
//        List<Item> filteredItems = new ArrayList<>();
//
//        for (int i = 0; i < companyItem.size(); i++) {
//            Item tempIn = companyItem.get(i);
//            if (tempIn.getItemType().equals(Type.CLOTHES)) {
//                filteredItems.add(tempIn);
//            }
//        }
//
//        return filteredItems;
//    }
//
//    @Override
//    public double sum() {
//        double total = 0;
//        for (int i = 0; i < companyItem.size(); i++) {
//            double itemPrice = companyItem.get(i).getPrice();
//            total += itemPrice;
//        }
//
//        return total;
//    }
//
//    @Override
//    public double count() {
//        return companyItem.size();
//    }
//
//    public double sum(Item item) {
//        double total = 0;
//        for (int i = 0; i < companyItem.size(); i++) {
//            Item curentItem = companyItem.get(i);
//
//            if (item.getItemType().equals(curentItem.getItemType())) {
//                double itemPrice = curentItem.getPrice();
//                total += itemPrice;
//            }
//        }
//        return total;
//    }
//
//    public double count(Item item) {
//        return filteredByType(item.getItemType()).size();
//    }
}
