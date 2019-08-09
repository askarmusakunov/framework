package apiBeans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PositiveGoRestResponse {

    @JsonProperty("_meta")
    private MetaBean meta;

    @JsonProperty("result")
    private Result result;

    private List<Result> results;

    public MetaBean getMeta() {
        return meta;
    }

    public void setMeta(MetaBean meta) {
        this.meta = meta;
    }

    public Result getResult() {
        return result;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    @JsonProperty("result")
    public void setResult(Object result) {

        if(result instanceof List) {
            this.results = (ArrayList<Result>) result;
        }
        else {
            this.result =(Result)result;
        }
    }
}
