package vn.com.edn.kamiah.demorecyclerview.data;

import java.util.ArrayList;

import vn.com.edn.kamiah.demorecyclerview.pojo.Country;

/**
 * Created by PC14-02 on 7/5/2016.
 */
public class CountryDatasource {

    public ArrayList<Country> getCountries(){

        ArrayList<Country> countries = null;

        countries = new ArrayList<>();
        countries.add(new Country("https://dl.dropboxusercontent.com/u/9148439/RecylcerView/germany_c.png","Germany","Đức"));
        countries.add(new Country("https://dl.dropboxusercontent.com/u/9148439/RecylcerView/france_c.png","France","Pháp"));
        countries.add(new Country("https://dl.dropboxusercontent.com/u/9148439/RecylcerView/wales_c.png","Wales","Xứ Wales"));
        countries.add(new Country("https://dl.dropboxusercontent.com/u/9148439/RecylcerView/portugal_c.png","Portugal","Bồ Đào Nha"));
        countries.add(new Country("https://dl.dropboxusercontent.com/u/9148439/RecylcerView/germany_c.png","Germany","Đức"));
        countries.add(new Country("https://dl.dropboxusercontent.com/u/9148439/RecylcerView/france_c.png","France","Pháp"));
        countries.add(new Country("https://dl.dropboxusercontent.com/u/9148439/RecylcerView/wales_c.png","Wales","Xứ Wales"));
        countries.add(new Country("https://dl.dropboxusercontent.com/u/9148439/RecylcerView/portugal_c.png","Portugal","Bồ Đào Nha"));
        countries.add(new Country("https://dl.dropboxusercontent.com/u/9148439/RecylcerView/germany_c.png","Germany","Đức"));
        countries.add(new Country("https://dl.dropboxusercontent.com/u/9148439/RecylcerView/france_c.png","France","Pháp"));
        countries.add(new Country("https://dl.dropboxusercontent.com/u/9148439/RecylcerView/wales_c.png","Wales","Xứ Wales"));
        countries.add(new Country("https://dl.dropboxusercontent.com/u/9148439/RecylcerView/portugal_c.png","Portugal","Bồ Đào Nha"));

        return  countries;
    }

}
