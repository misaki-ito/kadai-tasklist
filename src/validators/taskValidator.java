package validators;

import java.util.ArrayList;
import java.util.List;

import models.Task;

public class taskValidator {
    public static List<String> validate(Task t){
        List<String> errors = new ArrayList<String>();

        String content_error = validateContent(t.getContent());
        if(!content_error.equals("")){
            errors.add(content_error);
        }
        return errors;
    }

    public static String validateContent(String content){
        if(content == null || content.equals("")){
            return "タスクを入力してください。";
        }
        return "";
    }

}
