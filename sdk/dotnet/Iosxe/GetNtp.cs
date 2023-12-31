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
    public static class GetNtp
    {
        /// <summary>
        /// This data source can read the NTP configuration.
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
        ///     var example = Iosxe.GetNtp.Invoke();
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetNtpResult> InvokeAsync(GetNtpArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetNtpResult>("iosxe:index/getNtp:getNtp", args ?? new GetNtpArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the NTP configuration.
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
        ///     var example = Iosxe.GetNtp.Invoke();
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetNtpResult> Invoke(GetNtpInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetNtpResult>("iosxe:index/getNtp:getNtp", args ?? new GetNtpInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetNtpArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public string? Device { get; set; }

        public GetNtpArgs()
        {
        }
        public static new GetNtpArgs Empty => new GetNtpArgs();
    }

    public sealed class GetNtpInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        public GetNtpInvokeArgs()
        {
        }
        public static new GetNtpInvokeArgs Empty => new GetNtpInvokeArgs();
    }


    [OutputType]
    public sealed class GetNtpResult
    {
        public readonly string AccessGroupPeerAcl;
        public readonly string AccessGroupQueryOnlyAcl;
        public readonly string AccessGroupServeAcl;
        public readonly string AccessGroupServeOnlyAcl;
        /// <summary>
        /// Authenticate time sources
        /// </summary>
        public readonly bool Authenticate;
        /// <summary>
        /// Authentication key for trusted time sources
        /// </summary>
        public readonly ImmutableArray<Outputs.GetNtpAuthenticationKeyResult> AuthenticationKeys;
        /// <summary>
        /// Length of hardware clock tick
        /// </summary>
        public readonly int ClockPeriod;
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        public readonly string? Device;
        /// <summary>
        /// The path of the retrieved object.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Enable NTP message logging
        /// </summary>
        public readonly bool Logging;
        /// <summary>
        /// Act as NTP master clock
        /// </summary>
        public readonly bool Master;
        public readonly int MasterStratum;
        /// <summary>
        /// NTP passive mode
        /// </summary>
        public readonly bool Passive;
        /// <summary>
        /// VPN Routing/Forwarding Information
        /// </summary>
        public readonly ImmutableArray<Outputs.GetNtpPeerVrfResult> PeerVrfs;
        public readonly ImmutableArray<Outputs.GetNtpPeerResult> Peers;
        /// <summary>
        /// VPN Routing/Forwarding Information
        /// </summary>
        public readonly ImmutableArray<Outputs.GetNtpServerVrfResult> ServerVrfs;
        public readonly ImmutableArray<Outputs.GetNtpServerResult> Servers;
        /// <summary>
        /// Forty GigabitEthernet
        /// </summary>
        public readonly string TrapSourceFortyGigabitEthernet;
        /// <summary>
        /// GigabitEthernet IEEE 802.3z
        /// </summary>
        public readonly string TrapSourceGigabitEthernet;
        /// <summary>
        /// Hundred GigabitEthernet
        /// </summary>
        public readonly string TrapSourceHundredGigE;
        /// <summary>
        /// Loopback interface
        /// </summary>
        public readonly int TrapSourceLoopback;
        /// <summary>
        /// Ethernet Channel of interfaces
        /// </summary>
        public readonly int TrapSourcePortChannel;
        public readonly string TrapSourcePortChannelSubinterface;
        /// <summary>
        /// Ten Gigabit Ethernet
        /// </summary>
        public readonly string TrapSourceTenGigabitEthernet;
        /// <summary>
        /// Iosxr Vlans
        /// </summary>
        public readonly int TrapSourceVlan;
        /// <summary>
        /// Periodically update calendar with NTP time
        /// </summary>
        public readonly bool UpdateCalendar;

        [OutputConstructor]
        private GetNtpResult(
            string accessGroupPeerAcl,

            string accessGroupQueryOnlyAcl,

            string accessGroupServeAcl,

            string accessGroupServeOnlyAcl,

            bool authenticate,

            ImmutableArray<Outputs.GetNtpAuthenticationKeyResult> authenticationKeys,

            int clockPeriod,

            string? device,

            string id,

            bool logging,

            bool master,

            int masterStratum,

            bool passive,

            ImmutableArray<Outputs.GetNtpPeerVrfResult> peerVrfs,

            ImmutableArray<Outputs.GetNtpPeerResult> peers,

            ImmutableArray<Outputs.GetNtpServerVrfResult> serverVrfs,

            ImmutableArray<Outputs.GetNtpServerResult> servers,

            string trapSourceFortyGigabitEthernet,

            string trapSourceGigabitEthernet,

            string trapSourceHundredGigE,

            int trapSourceLoopback,

            int trapSourcePortChannel,

            string trapSourcePortChannelSubinterface,

            string trapSourceTenGigabitEthernet,

            int trapSourceVlan,

            bool updateCalendar)
        {
            AccessGroupPeerAcl = accessGroupPeerAcl;
            AccessGroupQueryOnlyAcl = accessGroupQueryOnlyAcl;
            AccessGroupServeAcl = accessGroupServeAcl;
            AccessGroupServeOnlyAcl = accessGroupServeOnlyAcl;
            Authenticate = authenticate;
            AuthenticationKeys = authenticationKeys;
            ClockPeriod = clockPeriod;
            Device = device;
            Id = id;
            Logging = logging;
            Master = master;
            MasterStratum = masterStratum;
            Passive = passive;
            PeerVrfs = peerVrfs;
            Peers = peers;
            ServerVrfs = serverVrfs;
            Servers = servers;
            TrapSourceFortyGigabitEthernet = trapSourceFortyGigabitEthernet;
            TrapSourceGigabitEthernet = trapSourceGigabitEthernet;
            TrapSourceHundredGigE = trapSourceHundredGigE;
            TrapSourceLoopback = trapSourceLoopback;
            TrapSourcePortChannel = trapSourcePortChannel;
            TrapSourcePortChannelSubinterface = trapSourcePortChannelSubinterface;
            TrapSourceTenGigabitEthernet = trapSourceTenGigabitEthernet;
            TrapSourceVlan = trapSourceVlan;
            UpdateCalendar = updateCalendar;
        }
    }
}
