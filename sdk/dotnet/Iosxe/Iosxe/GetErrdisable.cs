// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Iosxe.Iosxe
{
    public static class GetErrdisable
    {
        public static Task<GetErrdisableResult> InvokeAsync(GetErrdisableArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetErrdisableResult>("iosxe:iosxe/getErrdisable:getErrdisable", args ?? new GetErrdisableArgs(), options.WithDefaults());

        public static Output<GetErrdisableResult> Invoke(GetErrdisableInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetErrdisableResult>("iosxe:iosxe/getErrdisable:getErrdisable", args ?? new GetErrdisableInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetErrdisableArgs : global::Pulumi.InvokeArgs
    {
        [Input("device")]
        public string? Device { get; set; }

        public GetErrdisableArgs()
        {
        }
        public static new GetErrdisableArgs Empty => new GetErrdisableArgs();
    }

    public sealed class GetErrdisableInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("device")]
        public Input<string>? Device { get; set; }

        public GetErrdisableInvokeArgs()
        {
        }
        public static new GetErrdisableInvokeArgs Empty => new GetErrdisableInvokeArgs();
    }


    [OutputType]
    public sealed class GetErrdisableResult
    {
        public readonly bool DetectCauseAll;
        public readonly bool DetectCauseArpInspection;
        public readonly bool DetectCauseBpduguard;
        public readonly bool DetectCauseDhcpRateLimit;
        public readonly bool DetectCauseDtpFlap;
        public readonly bool DetectCauseGbicInvalid;
        public readonly bool DetectCauseInlinePower;
        public readonly bool DetectCauseL2ptguard;
        public readonly bool DetectCauseLinkFlap;
        public readonly bool DetectCauseLoopback;
        public readonly bool DetectCauseLoopdetect;
        public readonly bool DetectCauseMlacpMinlink;
        public readonly bool DetectCausePagpFlap;
        public readonly bool DetectCausePppoeIaRateLimit;
        public readonly bool DetectCauseSecurityViolationShutdownVlan;
        public readonly bool DetectCauseSfpConfigMismatch;
        public readonly bool DetectCauseSmallFrame;
        public readonly string? Device;
        public readonly int FlapSettingCauseDtpFlapMaxFlaps;
        public readonly int FlapSettingCauseDtpFlapTime;
        public readonly int FlapSettingCauseLinkFlapMaxFlaps;
        public readonly int FlapSettingCauseLinkFlapTime;
        public readonly int FlapSettingCausePagpFlapMaxFlaps;
        public readonly int FlapSettingCausePagpFlapTime;
        public readonly string Id;
        public readonly bool RecoveryCauseAll;
        public readonly bool RecoveryCauseArpInspection;
        public readonly bool RecoveryCauseBpduguard;
        public readonly bool RecoveryCauseChannelMisconfig;
        public readonly bool RecoveryCauseDhcpRateLimit;
        public readonly bool RecoveryCauseDtpFlap;
        public readonly bool RecoveryCauseGbicInvalid;
        public readonly bool RecoveryCauseInlinePower;
        public readonly bool RecoveryCauseL2ptguard;
        public readonly bool RecoveryCauseLinkFlap;
        public readonly bool RecoveryCauseLinkMonitorFailure;
        public readonly bool RecoveryCauseLoopback;
        public readonly bool RecoveryCauseLoopdetect;
        public readonly bool RecoveryCauseMacLimit;
        public readonly bool RecoveryCauseMlacpMinlink;
        public readonly bool RecoveryCausePagpFlap;
        public readonly bool RecoveryCausePortModeFailure;
        public readonly bool RecoveryCausePppoeIaRateLimit;
        public readonly bool RecoveryCausePsecureViolation;
        public readonly bool RecoveryCausePsp;
        public readonly bool RecoveryCauseSecurityViolation;
        public readonly bool RecoveryCauseSfpConfigMismatch;
        public readonly bool RecoveryCauseSmallFrame;
        public readonly bool RecoveryCauseStormControl;
        public readonly bool RecoveryCauseUdld;
        public readonly bool RecoveryCauseUnicastFlood;
        public readonly bool RecoveryCauseVmps;
        public readonly int RecoveryInterval;

        [OutputConstructor]
        private GetErrdisableResult(
            bool detectCauseAll,

            bool detectCauseArpInspection,

            bool detectCauseBpduguard,

            bool detectCauseDhcpRateLimit,

            bool detectCauseDtpFlap,

            bool detectCauseGbicInvalid,

            bool detectCauseInlinePower,

            bool detectCauseL2ptguard,

            bool detectCauseLinkFlap,

            bool detectCauseLoopback,

            bool detectCauseLoopdetect,

            bool detectCauseMlacpMinlink,

            bool detectCausePagpFlap,

            bool detectCausePppoeIaRateLimit,

            bool detectCauseSecurityViolationShutdownVlan,

            bool detectCauseSfpConfigMismatch,

            bool detectCauseSmallFrame,

            string? device,

            int flapSettingCauseDtpFlapMaxFlaps,

            int flapSettingCauseDtpFlapTime,

            int flapSettingCauseLinkFlapMaxFlaps,

            int flapSettingCauseLinkFlapTime,

            int flapSettingCausePagpFlapMaxFlaps,

            int flapSettingCausePagpFlapTime,

            string id,

            bool recoveryCauseAll,

            bool recoveryCauseArpInspection,

            bool recoveryCauseBpduguard,

            bool recoveryCauseChannelMisconfig,

            bool recoveryCauseDhcpRateLimit,

            bool recoveryCauseDtpFlap,

            bool recoveryCauseGbicInvalid,

            bool recoveryCauseInlinePower,

            bool recoveryCauseL2ptguard,

            bool recoveryCauseLinkFlap,

            bool recoveryCauseLinkMonitorFailure,

            bool recoveryCauseLoopback,

            bool recoveryCauseLoopdetect,

            bool recoveryCauseMacLimit,

            bool recoveryCauseMlacpMinlink,

            bool recoveryCausePagpFlap,

            bool recoveryCausePortModeFailure,

            bool recoveryCausePppoeIaRateLimit,

            bool recoveryCausePsecureViolation,

            bool recoveryCausePsp,

            bool recoveryCauseSecurityViolation,

            bool recoveryCauseSfpConfigMismatch,

            bool recoveryCauseSmallFrame,

            bool recoveryCauseStormControl,

            bool recoveryCauseUdld,

            bool recoveryCauseUnicastFlood,

            bool recoveryCauseVmps,

            int recoveryInterval)
        {
            DetectCauseAll = detectCauseAll;
            DetectCauseArpInspection = detectCauseArpInspection;
            DetectCauseBpduguard = detectCauseBpduguard;
            DetectCauseDhcpRateLimit = detectCauseDhcpRateLimit;
            DetectCauseDtpFlap = detectCauseDtpFlap;
            DetectCauseGbicInvalid = detectCauseGbicInvalid;
            DetectCauseInlinePower = detectCauseInlinePower;
            DetectCauseL2ptguard = detectCauseL2ptguard;
            DetectCauseLinkFlap = detectCauseLinkFlap;
            DetectCauseLoopback = detectCauseLoopback;
            DetectCauseLoopdetect = detectCauseLoopdetect;
            DetectCauseMlacpMinlink = detectCauseMlacpMinlink;
            DetectCausePagpFlap = detectCausePagpFlap;
            DetectCausePppoeIaRateLimit = detectCausePppoeIaRateLimit;
            DetectCauseSecurityViolationShutdownVlan = detectCauseSecurityViolationShutdownVlan;
            DetectCauseSfpConfigMismatch = detectCauseSfpConfigMismatch;
            DetectCauseSmallFrame = detectCauseSmallFrame;
            Device = device;
            FlapSettingCauseDtpFlapMaxFlaps = flapSettingCauseDtpFlapMaxFlaps;
            FlapSettingCauseDtpFlapTime = flapSettingCauseDtpFlapTime;
            FlapSettingCauseLinkFlapMaxFlaps = flapSettingCauseLinkFlapMaxFlaps;
            FlapSettingCauseLinkFlapTime = flapSettingCauseLinkFlapTime;
            FlapSettingCausePagpFlapMaxFlaps = flapSettingCausePagpFlapMaxFlaps;
            FlapSettingCausePagpFlapTime = flapSettingCausePagpFlapTime;
            Id = id;
            RecoveryCauseAll = recoveryCauseAll;
            RecoveryCauseArpInspection = recoveryCauseArpInspection;
            RecoveryCauseBpduguard = recoveryCauseBpduguard;
            RecoveryCauseChannelMisconfig = recoveryCauseChannelMisconfig;
            RecoveryCauseDhcpRateLimit = recoveryCauseDhcpRateLimit;
            RecoveryCauseDtpFlap = recoveryCauseDtpFlap;
            RecoveryCauseGbicInvalid = recoveryCauseGbicInvalid;
            RecoveryCauseInlinePower = recoveryCauseInlinePower;
            RecoveryCauseL2ptguard = recoveryCauseL2ptguard;
            RecoveryCauseLinkFlap = recoveryCauseLinkFlap;
            RecoveryCauseLinkMonitorFailure = recoveryCauseLinkMonitorFailure;
            RecoveryCauseLoopback = recoveryCauseLoopback;
            RecoveryCauseLoopdetect = recoveryCauseLoopdetect;
            RecoveryCauseMacLimit = recoveryCauseMacLimit;
            RecoveryCauseMlacpMinlink = recoveryCauseMlacpMinlink;
            RecoveryCausePagpFlap = recoveryCausePagpFlap;
            RecoveryCausePortModeFailure = recoveryCausePortModeFailure;
            RecoveryCausePppoeIaRateLimit = recoveryCausePppoeIaRateLimit;
            RecoveryCausePsecureViolation = recoveryCausePsecureViolation;
            RecoveryCausePsp = recoveryCausePsp;
            RecoveryCauseSecurityViolation = recoveryCauseSecurityViolation;
            RecoveryCauseSfpConfigMismatch = recoveryCauseSfpConfigMismatch;
            RecoveryCauseSmallFrame = recoveryCauseSmallFrame;
            RecoveryCauseStormControl = recoveryCauseStormControl;
            RecoveryCauseUdld = recoveryCauseUdld;
            RecoveryCauseUnicastFlood = recoveryCauseUnicastFlood;
            RecoveryCauseVmps = recoveryCauseVmps;
            RecoveryInterval = recoveryInterval;
        }
    }
}