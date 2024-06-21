package PastYear2019;

import java.util.ArrayList;
import java.util.List;

public class SortSalesList {

    public static void selectionSortRegion(List<SalesList> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (list.get(j).getRegion().compareTo(list.get(maxIdx).getRegion()) > 0) {
                    maxIdx = j;
                }
            }
            SalesList temp = list.get(maxIdx);
            list.set(maxIdx, list.get(i));
            list.set(i, temp);
        }
    }

    public static void insertionSortSalesAmount(List<SalesList> list) {
        int n = list.size();
        for (int i = 1; i < n; i++) {
            SalesList key = list.get(i);
            int j = i - 1;
            while (j >= 0 && list.get(j).getSalesAmount() > key.getSalesAmount()) {
                list.set(j + 1, list.get(j));
                j = j - 1;
            }
            list.set(j + 1, key);
        }
    }

    public static void bubbleSortSalesRepName(List<SalesList> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j).getSalesRepName().compareTo(list.get(j + 1).getSalesRepName()) > 0) {
                    SalesList temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    public static void mergeSortSalesRepName(List<SalesList> list) {
        if (list.size() < 2) {
            return;
        }
        int mid = list.size() / 2;
        List<SalesList> left = new ArrayList<>(list.subList(0, mid));
        List<SalesList> right = new ArrayList<>(list.subList(mid, list.size()));

        mergeSortSalesRepName(left);
        mergeSortSalesRepName(right);

        merge(list, left, right);
    }

    private static void merge(List<SalesList> list, List<SalesList> left, List<SalesList> right) {
        int i = 0, j = 0, k = 0;
        while (i < left.size() && j < right.size()) {
            if (left.get(i).getSalesRepName().compareTo(right.get(j).getSalesRepName()) <= 0) {
                list.set(k++, left.get(i++));
            } else {
                list.set(k++, right.get(j++));
            }
        }
        while (i < left.size()) {
            list.set(k++, left.get(i++));
        }
        while (j < right.size()) {
            list.set(k++, right.get(j++));
        }
    }

    public static void main(String[] args) {
        List<SalesList> salesData = new ArrayList<>();
        salesData.add(new SalesList("Asia", "Ahmad", 450));
        salesData.add(new SalesList("Europe", "Hemish", 518));
        salesData.add(new SalesList("Europe", "Banny", 650));
        salesData.add(new SalesList("Arcel and", "Ain", 200));
        salesData.add(new SalesList("Asia", "Ali", 390));
        salesData.add(new SalesList("Greenland", "Ben", 670));
        salesData.add(new SalesList("Asia", "Lee", 790));

        System.out.println("Original Data:");
        for (SalesList data : salesData) {
            System.out.println(data);
        }

        System.out.println("\nSorting Result on Region using SelectionSort:");
        selectionSortRegion(salesData);
        for (SalesList data : salesData) {
            System.out.println(data);
        }

        System.out.println("\nSorting Result on Sales using InsertionSort:");
        insertionSortSalesAmount(salesData);
        for (SalesList data : salesData) {
            System.out.println(data);
        }

        System.out.println("\nSorting Result on SalesRep using BubbleSort:");
        bubbleSortSalesRepName(salesData);
        for (SalesList data : salesData) {
            System.out.println(data);
        }

        System.out.println("\nSorting Result on SalesRep using MergeSort:");
        mergeSortSalesRepName(salesData);
        for (SalesList data : salesData) {
            System.out.println(data);
        }
    }
}
