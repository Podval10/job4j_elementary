package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
        String result = "I don't know. Please, ask another question.";
        if ("Hi, Bot.".equals(question)) {
            /* заменить ... на правильный ответ result = "ответ по заданию". */
            result = "Hi, SmartAss.";
        } else if ("Bye.".equals(question)) { /* заменить ... на проверку, известен ли боту этот вопрос и он знает как на него ответить. */
            /* заменить ... на правильный ответ result = "ответ по заданию". */
            result = "See you later.";
        }
        return result;
    }

    public static void main(String[] args) {
        String result = DummyBot.answer("Hi, Bot.");
        System.out.println(result);
        result = DummyBot.answer("Bye.");
        System.out.println(result);
    }
}

