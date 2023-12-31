// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Iosxe
{
    public static class GetDot1x
    {
        /// <summary>
        /// This data source can read the Dot1x configuration.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Iosxe = Pulumi.Iosxe;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Iosxe.GetDot1x.Invoke();
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetDot1xResult> InvokeAsync(GetDot1xArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDot1xResult>("iosxe:index/getDot1x:getDot1x", args ?? new GetDot1xArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the Dot1x configuration.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Iosxe = Pulumi.Iosxe;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Iosxe.GetDot1x.Invoke();
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetDot1xResult> Invoke(GetDot1xInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDot1xResult>("iosxe:index/getDot1x:getDot1x", args ?? new GetDot1xInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDot1xArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public string? Device { get; set; }

        public GetDot1xArgs()
        {
        }
        public static new GetDot1xArgs Empty => new GetDot1xArgs();
    }

    public sealed class GetDot1xInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        public GetDot1xInvokeArgs()
        {
        }
        public static new GetDot1xInvokeArgs Empty => new GetDot1xInvokeArgs();
    }


    [OutputType]
    public sealed class GetDot1xResult
    {
        /// <summary>
        /// Send EAPOL-Success on successful auth-fail Authorization
        /// </summary>
        public readonly bool AuthFailEapol;
        /// <summary>
        /// Configure 802.1X credentials profiles
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDot1xCredentialResult> Credentials;
        /// <summary>
        /// Block all EAPoL transaction on Critical Authentication
        /// </summary>
        public readonly bool CriticalEapolConfigBlock;
        /// <summary>
        /// Set 802.1x Critical Authentication Recovery Delay period
        /// </summary>
        public readonly int CriticalRecoveryDelay;
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        public readonly string? Device;
        /// <summary>
        /// The path of the retrieved object.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Show verbose messages in system logs
        /// </summary>
        public readonly bool LoggingVerbose;
        /// <summary>
        /// Controlled access is only applied during authentication
        /// </summary>
        public readonly bool SupplicantControlledTransient;
        /// <summary>
        /// Force 802.1X supplicant to send multicast packets
        /// </summary>
        public readonly bool SupplicantForceMulticast;
        /// <summary>
        /// Enable or Disable SysAuthControl
        /// </summary>
        public readonly bool SystemAuthControl;
        /// <summary>
        /// Timeout for device EAPOL capabilities test in seconds
        /// </summary>
        public readonly int TestTimeout;

        [OutputConstructor]
        private GetDot1xResult(
            bool authFailEapol,

            ImmutableArray<Outputs.GetDot1xCredentialResult> credentials,

            bool criticalEapolConfigBlock,

            int criticalRecoveryDelay,

            string? device,

            string id,

            bool loggingVerbose,

            bool supplicantControlledTransient,

            bool supplicantForceMulticast,

            bool systemAuthControl,

            int testTimeout)
        {
            AuthFailEapol = authFailEapol;
            Credentials = credentials;
            CriticalEapolConfigBlock = criticalEapolConfigBlock;
            CriticalRecoveryDelay = criticalRecoveryDelay;
            Device = device;
            Id = id;
            LoggingVerbose = loggingVerbose;
            SupplicantControlledTransient = supplicantControlledTransient;
            SupplicantForceMulticast = supplicantForceMulticast;
            SystemAuthControl = systemAuthControl;
            TestTimeout = testTimeout;
        }
    }
}
