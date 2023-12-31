// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAccessListStandardEntry {
    /**
     * @return Any source prefix
     * 
     */
    private Boolean denyAny;
    /**
     * @return A single source host
     * 
     */
    private String denyHost;
    /**
     * @return Log matches against this entry
     * 
     */
    private Boolean denyLog;
    /**
     * @return Network address prefix
     * 
     */
    private String denyPrefix;
    /**
     * @return Wildcard bits
     * 
     */
    private String denyPrefixMask;
    /**
     * @return Any source prefix
     * 
     */
    private Boolean permitAny;
    /**
     * @return A single source host
     * 
     */
    private String permitHost;
    /**
     * @return Log matches against this entry
     * 
     */
    private Boolean permitLog;
    /**
     * @return Network address prefix
     * 
     */
    private String permitPrefix;
    /**
     * @return Wildcard bits
     * 
     */
    private String permitPrefixMask;
    /**
     * @return Access list entry comment
     * 
     */
    private String remark;
    private Integer sequence;

    private GetAccessListStandardEntry() {}
    /**
     * @return Any source prefix
     * 
     */
    public Boolean denyAny() {
        return this.denyAny;
    }
    /**
     * @return A single source host
     * 
     */
    public String denyHost() {
        return this.denyHost;
    }
    /**
     * @return Log matches against this entry
     * 
     */
    public Boolean denyLog() {
        return this.denyLog;
    }
    /**
     * @return Network address prefix
     * 
     */
    public String denyPrefix() {
        return this.denyPrefix;
    }
    /**
     * @return Wildcard bits
     * 
     */
    public String denyPrefixMask() {
        return this.denyPrefixMask;
    }
    /**
     * @return Any source prefix
     * 
     */
    public Boolean permitAny() {
        return this.permitAny;
    }
    /**
     * @return A single source host
     * 
     */
    public String permitHost() {
        return this.permitHost;
    }
    /**
     * @return Log matches against this entry
     * 
     */
    public Boolean permitLog() {
        return this.permitLog;
    }
    /**
     * @return Network address prefix
     * 
     */
    public String permitPrefix() {
        return this.permitPrefix;
    }
    /**
     * @return Wildcard bits
     * 
     */
    public String permitPrefixMask() {
        return this.permitPrefixMask;
    }
    /**
     * @return Access list entry comment
     * 
     */
    public String remark() {
        return this.remark;
    }
    public Integer sequence() {
        return this.sequence;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccessListStandardEntry defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean denyAny;
        private String denyHost;
        private Boolean denyLog;
        private String denyPrefix;
        private String denyPrefixMask;
        private Boolean permitAny;
        private String permitHost;
        private Boolean permitLog;
        private String permitPrefix;
        private String permitPrefixMask;
        private String remark;
        private Integer sequence;
        public Builder() {}
        public Builder(GetAccessListStandardEntry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.denyAny = defaults.denyAny;
    	      this.denyHost = defaults.denyHost;
    	      this.denyLog = defaults.denyLog;
    	      this.denyPrefix = defaults.denyPrefix;
    	      this.denyPrefixMask = defaults.denyPrefixMask;
    	      this.permitAny = defaults.permitAny;
    	      this.permitHost = defaults.permitHost;
    	      this.permitLog = defaults.permitLog;
    	      this.permitPrefix = defaults.permitPrefix;
    	      this.permitPrefixMask = defaults.permitPrefixMask;
    	      this.remark = defaults.remark;
    	      this.sequence = defaults.sequence;
        }

        @CustomType.Setter
        public Builder denyAny(Boolean denyAny) {
            this.denyAny = Objects.requireNonNull(denyAny);
            return this;
        }
        @CustomType.Setter
        public Builder denyHost(String denyHost) {
            this.denyHost = Objects.requireNonNull(denyHost);
            return this;
        }
        @CustomType.Setter
        public Builder denyLog(Boolean denyLog) {
            this.denyLog = Objects.requireNonNull(denyLog);
            return this;
        }
        @CustomType.Setter
        public Builder denyPrefix(String denyPrefix) {
            this.denyPrefix = Objects.requireNonNull(denyPrefix);
            return this;
        }
        @CustomType.Setter
        public Builder denyPrefixMask(String denyPrefixMask) {
            this.denyPrefixMask = Objects.requireNonNull(denyPrefixMask);
            return this;
        }
        @CustomType.Setter
        public Builder permitAny(Boolean permitAny) {
            this.permitAny = Objects.requireNonNull(permitAny);
            return this;
        }
        @CustomType.Setter
        public Builder permitHost(String permitHost) {
            this.permitHost = Objects.requireNonNull(permitHost);
            return this;
        }
        @CustomType.Setter
        public Builder permitLog(Boolean permitLog) {
            this.permitLog = Objects.requireNonNull(permitLog);
            return this;
        }
        @CustomType.Setter
        public Builder permitPrefix(String permitPrefix) {
            this.permitPrefix = Objects.requireNonNull(permitPrefix);
            return this;
        }
        @CustomType.Setter
        public Builder permitPrefixMask(String permitPrefixMask) {
            this.permitPrefixMask = Objects.requireNonNull(permitPrefixMask);
            return this;
        }
        @CustomType.Setter
        public Builder remark(String remark) {
            this.remark = Objects.requireNonNull(remark);
            return this;
        }
        @CustomType.Setter
        public Builder sequence(Integer sequence) {
            this.sequence = Objects.requireNonNull(sequence);
            return this;
        }
        public GetAccessListStandardEntry build() {
            final var o = new GetAccessListStandardEntry();
            o.denyAny = denyAny;
            o.denyHost = denyHost;
            o.denyLog = denyLog;
            o.denyPrefix = denyPrefix;
            o.denyPrefixMask = denyPrefixMask;
            o.permitAny = permitAny;
            o.permitHost = permitHost;
            o.permitLog = permitLog;
            o.permitPrefix = permitPrefix;
            o.permitPrefixMask = permitPrefixMask;
            o.remark = remark;
            o.sequence = sequence;
            return o;
        }
    }
}
