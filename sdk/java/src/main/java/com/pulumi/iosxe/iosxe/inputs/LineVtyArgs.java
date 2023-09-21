// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.iosxe.iosxe.inputs.LineVtyAccessClassArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LineVtyArgs extends com.pulumi.resources.ResourceArgs {

    public static final LineVtyArgs Empty = new LineVtyArgs();

    @Import(name="accessClasses")
    private @Nullable Output<List<LineVtyAccessClassArgs>> accessClasses;

    public Optional<Output<List<LineVtyAccessClassArgs>>> accessClasses() {
        return Optional.ofNullable(this.accessClasses);
    }

    @Import(name="escapeCharacter")
    private @Nullable Output<String> escapeCharacter;

    public Optional<Output<String>> escapeCharacter() {
        return Optional.ofNullable(this.escapeCharacter);
    }

    @Import(name="execTimeoutMinutes")
    private @Nullable Output<Integer> execTimeoutMinutes;

    public Optional<Output<Integer>> execTimeoutMinutes() {
        return Optional.ofNullable(this.execTimeoutMinutes);
    }

    @Import(name="execTimeoutSeconds")
    private @Nullable Output<Integer> execTimeoutSeconds;

    public Optional<Output<Integer>> execTimeoutSeconds() {
        return Optional.ofNullable(this.execTimeoutSeconds);
    }

    @Import(name="first", required=true)
    private Output<Integer> first;

    public Output<Integer> first() {
        return this.first;
    }

    @Import(name="last")
    private @Nullable Output<Integer> last;

    public Optional<Output<Integer>> last() {
        return Optional.ofNullable(this.last);
    }

    @Import(name="loginAuthentication")
    private @Nullable Output<String> loginAuthentication;

    public Optional<Output<String>> loginAuthentication() {
        return Optional.ofNullable(this.loginAuthentication);
    }

    @Import(name="password")
    private @Nullable Output<String> password;

    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    @Import(name="passwordLevel")
    private @Nullable Output<Integer> passwordLevel;

    public Optional<Output<Integer>> passwordLevel() {
        return Optional.ofNullable(this.passwordLevel);
    }

    @Import(name="passwordType")
    private @Nullable Output<String> passwordType;

    public Optional<Output<String>> passwordType() {
        return Optional.ofNullable(this.passwordType);
    }

    @Import(name="transportPreferredProtocol")
    private @Nullable Output<String> transportPreferredProtocol;

    public Optional<Output<String>> transportPreferredProtocol() {
        return Optional.ofNullable(this.transportPreferredProtocol);
    }

    private LineVtyArgs() {}

    private LineVtyArgs(LineVtyArgs $) {
        this.accessClasses = $.accessClasses;
        this.escapeCharacter = $.escapeCharacter;
        this.execTimeoutMinutes = $.execTimeoutMinutes;
        this.execTimeoutSeconds = $.execTimeoutSeconds;
        this.first = $.first;
        this.last = $.last;
        this.loginAuthentication = $.loginAuthentication;
        this.password = $.password;
        this.passwordLevel = $.passwordLevel;
        this.passwordType = $.passwordType;
        this.transportPreferredProtocol = $.transportPreferredProtocol;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LineVtyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LineVtyArgs $;

        public Builder() {
            $ = new LineVtyArgs();
        }

        public Builder(LineVtyArgs defaults) {
            $ = new LineVtyArgs(Objects.requireNonNull(defaults));
        }

        public Builder accessClasses(@Nullable Output<List<LineVtyAccessClassArgs>> accessClasses) {
            $.accessClasses = accessClasses;
            return this;
        }

        public Builder accessClasses(List<LineVtyAccessClassArgs> accessClasses) {
            return accessClasses(Output.of(accessClasses));
        }

        public Builder accessClasses(LineVtyAccessClassArgs... accessClasses) {
            return accessClasses(List.of(accessClasses));
        }

        public Builder escapeCharacter(@Nullable Output<String> escapeCharacter) {
            $.escapeCharacter = escapeCharacter;
            return this;
        }

        public Builder escapeCharacter(String escapeCharacter) {
            return escapeCharacter(Output.of(escapeCharacter));
        }

        public Builder execTimeoutMinutes(@Nullable Output<Integer> execTimeoutMinutes) {
            $.execTimeoutMinutes = execTimeoutMinutes;
            return this;
        }

        public Builder execTimeoutMinutes(Integer execTimeoutMinutes) {
            return execTimeoutMinutes(Output.of(execTimeoutMinutes));
        }

        public Builder execTimeoutSeconds(@Nullable Output<Integer> execTimeoutSeconds) {
            $.execTimeoutSeconds = execTimeoutSeconds;
            return this;
        }

        public Builder execTimeoutSeconds(Integer execTimeoutSeconds) {
            return execTimeoutSeconds(Output.of(execTimeoutSeconds));
        }

        public Builder first(Output<Integer> first) {
            $.first = first;
            return this;
        }

        public Builder first(Integer first) {
            return first(Output.of(first));
        }

        public Builder last(@Nullable Output<Integer> last) {
            $.last = last;
            return this;
        }

        public Builder last(Integer last) {
            return last(Output.of(last));
        }

        public Builder loginAuthentication(@Nullable Output<String> loginAuthentication) {
            $.loginAuthentication = loginAuthentication;
            return this;
        }

        public Builder loginAuthentication(String loginAuthentication) {
            return loginAuthentication(Output.of(loginAuthentication));
        }

        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        public Builder password(String password) {
            return password(Output.of(password));
        }

        public Builder passwordLevel(@Nullable Output<Integer> passwordLevel) {
            $.passwordLevel = passwordLevel;
            return this;
        }

        public Builder passwordLevel(Integer passwordLevel) {
            return passwordLevel(Output.of(passwordLevel));
        }

        public Builder passwordType(@Nullable Output<String> passwordType) {
            $.passwordType = passwordType;
            return this;
        }

        public Builder passwordType(String passwordType) {
            return passwordType(Output.of(passwordType));
        }

        public Builder transportPreferredProtocol(@Nullable Output<String> transportPreferredProtocol) {
            $.transportPreferredProtocol = transportPreferredProtocol;
            return this;
        }

        public Builder transportPreferredProtocol(String transportPreferredProtocol) {
            return transportPreferredProtocol(Output.of(transportPreferredProtocol));
        }

        public LineVtyArgs build() {
            $.first = Objects.requireNonNull($.first, "expected parameter 'first' to be non-null");
            return $;
        }
    }

}