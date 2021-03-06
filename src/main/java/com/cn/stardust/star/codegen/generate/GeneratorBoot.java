package com.cn.stardust.star.codegen.generate;

import com.cn.stardust.star.codegen.metadata.ClassMetaData;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * https://github.com/oraclexing
 * <p>
 *
 * @author stardust
 * @version 1.0.0
 */
final public class GeneratorBoot extends AbstractGenerator{

    private static GeneratorBoot generatorBoot ;


    static {
        generatorBoot = new GeneratorBoot();
    }

    private GeneratorBoot() {}


    /**
     * 引导启动
     * @param metaData 待导出的元数据
     * @param outPutPath  导出文件位置
     * @return
     */
    public static GeneratorBoot getInstance(List<ClassMetaData> metaData , String outPutPath){
        outputPath = outPutPath;
        metaDatas.clear();
        metaDatas.addAll(metaData);
        generators.clear();
        generators.addAll(Lists
                .newArrayList(MapperGenerator.mapperGenerator,
                        ServiceGenerator.serviceGenerator,
                        ModelGenerator.modelGenerator,
                        ServiceImplGenerator.serviceImplGenerator));
        if(null == generatorBoot){
            generatorBoot = new GeneratorBoot();
        }
        return generatorBoot;
    }
}
