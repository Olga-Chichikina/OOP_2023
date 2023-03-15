package homework.Proect3;

/**
 * поведение домашних животных
 */
public interface Action {
/**
 * говорить
 */
    void speak();
/**
 * @param meal кушать 
 */
    void eat(Integer meal);
/**
 * реагировать
 */
    void reaction();

}

