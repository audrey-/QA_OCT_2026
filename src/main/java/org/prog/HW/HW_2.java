package org.prog.HW;


//TODO: email rules:
// - email must have only 1 @
// - before @ must be at least 3 symbols
// - after @ must be at least 5 symbols
// - after @ must be at least 1 dot (.)
// - dot may neve be first or last symbol


public class HW_2 {
    public static void main(String[] args) {
        String[] emailsMass = {
                "john@mail.com",
                "jo@gmail.com",
                "peter@localhost",
                "alex.smith@company.net",
                "max@b@c.com",
                "bob@a.io",
                "anna@x.y.z",
                ".sara@mail.com",
                "kate.mail.com",
                "lee@ab.cd",
                "john.doe@server",
                "tom@mail.com.",
                "ann@site.org",
                "@mail.com",
                "first.last@my-server.com"
        };
        for (int j = 0; j < emailsMass.length; j++) {  // цикл для массива
            String oneEmail = emailsMass[j];
            int count = 0;        // сколько раз встретился @
            int atIndex = -1;     // позиция @ (-1 = не найдена)
            int dotsAfterAt = 0;  // сколько точек после @

            for (int i = 0; i < oneEmail.length(); i++) { //проходимся по каждому элементу массива
                if (oneEmail.charAt(i) == '@') { // перебираем символы и ищем @
                    count++;
                    atIndex = i;
                    dotsAfterAt = 0;   // после @ проверяем точки заново, для проверки 4 правила
                } else if (oneEmail.charAt(i) == '.') {
                    dotsAfterAt++;
                }
            }

            boolean rule1 = count == 1;                               // ровно один @
            boolean rule2 = atIndex >= 3;                             // перед @ минимум 3 символа
            boolean rule3 = oneEmail.length() - atIndex - 1 >= 5;        // после @ минимум 5 символов
            boolean rule4 = dotsAfterAt >= 1;                         // после @ минимум одна точка
            boolean rule5 = oneEmail.charAt(0) != '.' && oneEmail.charAt(oneEmail.length() - 1) != '.';  // точка не первая и не последняя

            if (rule1 && rule2 && rule3 && rule4 && rule5) {
                System.out.println(oneEmail + " -> e-mail указан верно согластно требованиям");
            }
        }
    }
}