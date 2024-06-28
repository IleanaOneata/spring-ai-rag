package guru.springframework.springairag.services;

import guru.springframework.springairag.model.Answer;
import guru.springframework.springairag.model.Question;

/**
 * @author ileanaoneata on 28.06.2024
 */
public interface OpenAIService {

    Answer getAnswer(Question question);
}
