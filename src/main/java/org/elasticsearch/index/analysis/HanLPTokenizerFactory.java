package org.elasticsearch.index.analysis;

import com.hankcs.hanlp.HanLP;
import com.hankcs.lucene4.HanLPTokenizer;
import org.apache.lucene.analysis.Tokenizer;
import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.common.inject.assistedinject.Assisted;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.index.Index;
import org.elasticsearch.index.settings.IndexSettings;

import java.io.Reader;

/**
 */
public class HanLPTokenizerFactory extends AbstractTokenizerFactory {

    private boolean enableIndexMode;
    private boolean enablePorterStemming;
    @Inject
    public HanLPTokenizerFactory(Index index, @IndexSettings Settings indexSettings, @Assisted String name, @Assisted Settings settings) {
        super(index, indexSettings, name, settings);
        enableIndexMode = settings.getAsBoolean("enableIndexMode", true);
        enablePorterStemming = settings.getAsBoolean("enablePorterStemming", false);
    }

    @Override
    public Tokenizer create(Reader reader) {
            return new HanLPTokenizer(HanLP.newSegment().enableAllNamedEntityRecognize(true).enableCustomDictionary(true).enableIndexMode(true), reader, null, enablePorterStemming);
    }
}

