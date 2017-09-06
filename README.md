elasticsearch-analysis-hanlp
========

## 1、	需要的安装文件
    elasticsearch-analysis-hanlp-1.0-SNAPSHOT.jar
    hanlp-1.2.4.jar
    hanlp.properties
    es-plugin.properties
    data-for-1.2.8-full.zip
----------------------

## 2、	放置的目录
（1）	插件文件
    elasticsearch-analysis-hanlp-1.0-SNAPSHOT.jar
    hanlp-1.2.4.jar
    hanlp.properties
    es-plugin.properties
    放在${ES_HOME}/plugins/hanlp下面
（2）	词典文件
    data-for-1.2.8-full.zip放在 /data/hanlp下面并解压
----------------------

## 3、	修改elasticsearch.yml
...
    index:
        analysis:
            analyzer:
                hanlp:
                    tokenizer: hanlp_tok
                hanlp_syno:
                    tokenizer: hanlp_tok
                    filter: [synonym]
            tokenizer:
                hanlp_tok:
                    type: hanlp
...

## 版权
 Apache License Version 2.0
