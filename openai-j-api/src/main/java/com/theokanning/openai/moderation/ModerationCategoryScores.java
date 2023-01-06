package com.theokanning.openai.moderation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An object containing the scores for each moderation category
 *
 * https://beta.openai.com/docs/api-reference/moderations/create
 */

public class ModerationCategoryScores {

    public double hate;

    @JsonProperty("hate/threatening")
    public double hateThreatening;

    @JsonProperty("self-harm")
    public double selfHarm;

    public double sexual;

    @JsonProperty("sexual/minors")
    public double sexualMinors;

    public double violence;

    @JsonProperty("violence/graphic")
    public double violenceGraphic;

    public double getHate() {
        return hate;
    }

    public void setHate(double hate) {
        this.hate = hate;
    }

    public double getHateThreatening() {
        return hateThreatening;
    }

    public void setHateThreatening(double hateThreatening) {
        this.hateThreatening = hateThreatening;
    }

    public double getSelfHarm() {
        return selfHarm;
    }

    public void setSelfHarm(double selfHarm) {
        this.selfHarm = selfHarm;
    }

    public double getSexual() {
        return sexual;
    }

    public void setSexual(double sexual) {
        this.sexual = sexual;
    }

    public double getSexualMinors() {
        return sexualMinors;
    }

    public void setSexualMinors(double sexualMinors) {
        this.sexualMinors = sexualMinors;
    }

    public double getViolence() {
        return violence;
    }

    public void setViolence(double violence) {
        this.violence = violence;
    }

    public double getViolenceGraphic() {
        return violenceGraphic;
    }

    public void setViolenceGraphic(double violenceGraphic) {
        this.violenceGraphic = violenceGraphic;
    }
}
