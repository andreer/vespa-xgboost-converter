package ai.vespa.examples.xgboostconverter;

import ai.vespa.rankingexpression.importer.xgboost.XGBoostImporter;
import com.yahoo.searchlib.rankingexpression.RankingExpression;
import ai.vespa.rankingexpression.importer.ImportedModel;

public class XGBoostConverter {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("usage: xgboostconverter somefile.json");
            System.exit(1);
        }
        ImportedModel model = new XGBoostImporter().importModel("somefile", args[0]);
        RankingExpression expression = model.expressions().get("somefile");
        System.out.println(expression.getRoot());
    }
}
