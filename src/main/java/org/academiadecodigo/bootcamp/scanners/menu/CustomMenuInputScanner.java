package org.academiadecodigo.bootcamp.scanners.menu;

import org.academiadecodigo.bootcamp.scanners.integer.IntegerSetInputScanner;
import java.util.Map;

public class CustomMenuInputScanner extends IntegerSetInputScanner {
    private Map<Integer,String> optionMap;

    public CustomMenuInputScanner(Map<Integer,String> optionMap) {
        super(optionMap.keySet());
        this.optionMap = optionMap;
        super.setMessage(buildMenu(getMessage()));
    }

    @Override
    public void setMessage(String message) {
        super.setMessage(buildMenu(message));
    }

    private String buildMenu(String message) {

        StringBuilder menuBuilder = new StringBuilder("\n");
        menuBuilder.append(message);
        menuBuilder.append("\n");

        for(Integer i: optionMap.keySet()) {
            menuBuilder.append("\n");
            menuBuilder.append(i + " - " + optionMap.get(i));
        }

        menuBuilder.append("\n> ");
        return menuBuilder.toString();

    }
}
