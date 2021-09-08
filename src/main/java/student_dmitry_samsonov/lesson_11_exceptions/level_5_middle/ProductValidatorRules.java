package student_dmitry_samsonov.lesson_11_exceptions.level_5_middle;

import java.util.HashMap;
import java.util.Map;

class ProductValidatorRules {
    private HashMap<String, String[]> rules = new HashMap<String, String[]>();

    public ProductValidatorRules() {
        this.rules.put("Title Rule 1", new String[]{"не должно быть пустым",
                ProductValidatorFields.Title.toString()});
        this.rules.put("Title Rule 2", new String[]{"не должно быть короче 3 символов",
                ProductValidatorFields.Title.toString()});
        this.rules.put("Title Rule 3", new String[]{"не должно быть длиннее 100 символов",
                ProductValidatorFields.Title.toString()});
        this.rules.put("Title Rule 4", new String[]{"должно содержать только английские буквы и цифры, другие символы" +
                " не допустимы",
                ProductValidatorFields.Title.toString()});
        this.rules.put("Price Rule 1", new String[]{"не должна быть пустой",
                ProductValidatorFields.Price.toString()});
        this.rules.put("Price Rule 2", new String[]{"должна содержать только цифры",
                ProductValidatorFields.Price.toString()});
        this.rules.put("Price Rule 3", new String[]{"не может быть 0",
                ProductValidatorFields.Price.toString()});
        this.rules.put("Description Rule 1", new String[]{"нее должно быть длиннее 2000 символов",
                ProductValidatorFields.Description.toString()});
        this.rules.put("Description Rule 2", new String[]{"должно содержать только английские буквы и цифры, другие " +
                "символы не допустимы",
                ProductValidatorFields.Description.toString()});
    }

    public Map<String, String[]> getRules() {
        return rules;
    }
    public String getDescription(String title) {
        return this.rules.get(title)[0];
    }
    public String getFieldName(String title) {
        return this.rules.get(title)[1];
    }
}