package stockproject;


public class StockProject {

    public static void main(String[] args) {
        Stock stock1 = new Stock("ORCL","Oracle Corporation");
        
        stock1.previousClosingPrice = 34.5;
        stock1.currentPrice = 34.35 ;
        
        System.out.println(" Hissenin Adi: " + stock1.name);
        System.out.println(" Hissenin Sembolu: " + stock1.symbol);
        System.out.println(" Onceki Kapanis Fiyati: " + stock1.previousClosingPrice);
        System.out.println(" Hissenin Guncel Fiyati: " + stock1.currentPrice);
        System.out.println(" Fiyattaki Degisim Yuzdesi: " + stock1.getChangePercent());
        
    }
    
}

class Stock{
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    Stock(String newSymbol, String newName){
    symbol = newSymbol;
    name = newName;
    }
    double getChangePercent(){
    return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }
}