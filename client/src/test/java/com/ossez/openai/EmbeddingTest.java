package com.ossez.openai;

import com.ossez.openai.embedding.Embedding;
import com.ossez.openai.embedding.EmbeddingRequest;
import com.ossez.openai.embedding.EmbeddingRequestBuilder;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;


public class EmbeddingTest {

    String token = System.getenv("OPENAI_TOKEN");
    OpenAiService service = new OpenAiService(token);

    @Test
    void createEmbeddings() {
        EmbeddingRequest embeddingRequest = new EmbeddingRequestBuilder()
                .setModel("text-similarity-babbage-001")
                .setInput(Collections.singletonList("The food was delicious and the waiter..."))
                .createEmbeddingRequest();

        List<Embedding> embeddings = service.createEmbeddings(embeddingRequest).getData();

        assertFalse(embeddings.isEmpty());
        assertFalse(embeddings.get(0).getEmbedding().isEmpty());
    }

    @Test
    void createEmbeddingsDeprecated() {
        EmbeddingRequest embeddingRequest = new EmbeddingRequestBuilder()
                .setInput(Collections.singletonList("The food was delicious and the waiter..."))
                .createEmbeddingRequest();

        List<Embedding> embeddings = service.createEmbeddings("text-similarity-babbage-001", embeddingRequest).getData();

        assertFalse(embeddings.isEmpty());
        assertFalse(embeddings.get(0).getEmbedding().isEmpty());
    }
}
