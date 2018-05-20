package cn.myperf4j.core.config;

import cn.myperf4j.core.constant.PropertyValues;

/**
 * Created by LinShunkang on 2018/5/12
 */
public class ProfilingConfig {

    private static final ProfilingConfig instance = new ProfilingConfig();

    private String perStatsProcessor;

    private String recorderMode;

    private long milliTimeSlice;

    private String includePackages;

    private String excludePackages;

    private String excludeClassLoaders;

    private boolean printDebugLog;

    private String profilingType;

    private String excludeMethods;

    private boolean excludePrivateMethod;

    /**
     * singleton pattern
     */
    public static ProfilingConfig getInstance() {
        return instance;
    }

    public String getPerStatsProcessor() {
        return perStatsProcessor;
    }

    public void setPerStatsProcessor(String perStatsProcessor) {
        this.perStatsProcessor = perStatsProcessor;
    }

    public String getRecorderMode() {
        return recorderMode;
    }

    public boolean isAccurateMode() {
        return recorderMode.equals(PropertyValues.RECORDER_MODE_ACCURATE);
    }

    public void setRecorderMode(String recorderMode) {
        this.recorderMode = recorderMode;
    }

    public long getMilliTimeSlice() {
        return milliTimeSlice;
    }

    public void setMilliTimeSlice(long milliTimeSlice) {
        this.milliTimeSlice = milliTimeSlice;
    }

    public String getIncludePackages() {
        return includePackages;
    }

    public void setIncludePackages(String includePackages) {
        this.includePackages = includePackages;
    }

    public String getExcludePackages() {
        return excludePackages;
    }

    public void setExcludePackages(String excludePackages) {
        this.excludePackages = excludePackages;
    }

    public String getExcludeClassLoaders() {
        return excludeClassLoaders;
    }

    public void setExcludeClassLoaders(String excludeClassLoaders) {
        this.excludeClassLoaders = excludeClassLoaders;
    }

    public boolean isPrintDebugLog() {
        return printDebugLog;
    }

    public void setPrintDebugLog(boolean printDebugLog) {
        this.printDebugLog = printDebugLog;
    }

    public String getProfilingType() {
        return profilingType;
    }

    public boolean profilingByProfiler() {
        return profilingType.equals(PropertyValues.ASM_PROFILING_TYPE_PROFILER);
    }

    public void setProfilingType(String profilingType) {
        this.profilingType = profilingType;
    }

    public String getExcludeMethods() {
        return excludeMethods;
    }

    public void setExcludeMethods(String excludeMethods) {
        this.excludeMethods = excludeMethods;
    }

    public boolean isExcludePrivateMethod() {
        return excludePrivateMethod;
    }

    public void setExcludePrivateMethod(boolean excludePrivateMethod) {
        this.excludePrivateMethod = excludePrivateMethod;
    }

    @Override
    public String toString() {
        return "ProfilingConfig{" +
                "perStatsProcessor='" + perStatsProcessor + '\'' +
                ", recorderMode='" + recorderMode + '\'' +
                ", milliTimeSlice=" + milliTimeSlice +
                ", includePackages='" + includePackages + '\'' +
                ", excludePackages='" + excludePackages + '\'' +
                ", excludeClassLoaders='" + excludeClassLoaders + '\'' +
                ", printDebugLog=" + printDebugLog +
                ", profilingType='" + profilingType + '\'' +
                ", excludeMethods='" + excludeMethods + '\'' +
                ", excludePrivateMethod=" + excludePrivateMethod +
                '}';
    }
}
