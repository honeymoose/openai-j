package com.ossez.openai.edit;

import com.ossez.openai.Usage;


import java.util.List;

/**
 * A list of edits generated by GPT-3
 *
 * https://beta.openai.com/docs/api-reference/edits/create
 */

public class EditResult {

    /**
     * The type of object returned, should be "edit"
     */
    public String object;

    /**
     * The creation time in epoch milliseconds.
     */
    public long created;

    /**
     * A list of generated edits.
     */
    public List<EditChoice> choices;

    /**
     * The API usage for this request
     */
    public Usage usage;

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public long getCreated() {
        return created;
    }

    public void setCreated(long created) {
        this.created = created;
    }

    public List<EditChoice> getChoices() {
        return choices;
    }

    public void setChoices(List<EditChoice> choices) {
        this.choices = choices;
    }

    public Usage getUsage() {
        return usage;
    }

    public void setUsage(Usage usage) {
        this.usage = usage;
    }
}
