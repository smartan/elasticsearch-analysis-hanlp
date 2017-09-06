package org.elasticsearch.plugin.analysis.hanlp;

import org.elasticsearch.common.inject.Module;
import org.elasticsearch.index.analysis.AnalysisModule;
import org.elasticsearch.index.analysis.HanLPAnalysisBinderProcessor;
import org.elasticsearch.plugins.AbstractPlugin;

/**
 * The HanLP Analysis HanLP module into elasticsearch.
 */
public class AnalysisHanlpPlugin extends AbstractPlugin {

    @Override
    public String name() {
        return "analysis-hanlp";
    }

    @Override
    public String description() {
        return "HanLP analysis";
    }

    @Override public void processModule(Module module) {
        if (module instanceof AnalysisModule) {
            AnalysisModule analysisModule = (AnalysisModule) module;
            analysisModule.addProcessor(new HanLPAnalysisBinderProcessor());
        }
    }
}
