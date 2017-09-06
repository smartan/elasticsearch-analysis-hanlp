package org.elasticsearch.index.analysis;

import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.common.inject.assistedinject.Assisted;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.env.Environment;
import org.elasticsearch.index.Index;
import org.elasticsearch.index.settings.IndexSettings;

import com.hankcs.lucene4.HanLPIndexAnalyzer;

/**
 */
public class HanLPAnalyzerProvider extends AbstractIndexAnalyzerProvider<HanLPIndexAnalyzer> {

    private final HanLPIndexAnalyzer analyzer;

    @Inject
    public HanLPAnalyzerProvider(Index index, @IndexSettings Settings indexSettings, Environment env, @Assisted String name, @Assisted Settings settings) {
        super(index, indexSettings, name, settings);
        
        analyzer = new HanLPIndexAnalyzer();
    }

    @Override
    public HanLPIndexAnalyzer get() {
        return this.analyzer;
    }
}
