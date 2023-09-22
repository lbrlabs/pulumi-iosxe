// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Iosxe.Outputs
{

    [OutputType]
    public sealed class AccessListExtendedEntry
    {
        /// <summary>
        /// - Choices: `deny`, `permit`
        /// </summary>
        public readonly string? AceRuleAction;
        public readonly string? AceRuleProtocol;
        /// <summary>
        /// Match on the ACK bit
        /// </summary>
        public readonly bool? Ack;
        /// <summary>
        /// Any destination host
        /// </summary>
        public readonly bool? DestinationAny;
        /// <summary>
        /// A single destination host
        /// </summary>
        public readonly string? DestinationHost;
        /// <summary>
        /// Destination network object group
        /// </summary>
        public readonly string? DestinationObjectGroup;
        /// <summary>
        /// Match only packets on a given port number up to 10 ports
        /// </summary>
        public readonly string? DestinationPortEqual;
        /// <summary>
        /// Match only packets with a greater port number
        /// </summary>
        public readonly string? DestinationPortGreaterThan;
        /// <summary>
        /// Match only packets with a lower port number
        /// </summary>
        public readonly string? DestinationPortLesserThan;
        /// <summary>
        /// Match only packets in the range of port numbers
        /// </summary>
        public readonly string? DestinationPortRangeFrom;
        /// <summary>
        /// Match only packets in the range of port numbers
        /// </summary>
        public readonly string? DestinationPortRangeTo;
        public readonly string? DestinationPrefix;
        public readonly string? DestinationPrefixMask;
        /// <summary>
        /// Match packets with given dscp value
        /// </summary>
        public readonly string? Dscp;
        /// <summary>
        /// Match established connections
        /// </summary>
        public readonly bool? Established;
        /// <summary>
        /// Match on the FIN bit
        /// </summary>
        public readonly bool? Fin;
        /// <summary>
        /// Check non-initial fragments
        /// </summary>
        public readonly bool? Fragments;
        /// <summary>
        /// Log matches against this entry
        /// </summary>
        public readonly bool? Log;
        /// <summary>
        /// Log matches against this entry, including input interface
        /// </summary>
        public readonly bool? LogInput;
        /// <summary>
        /// Match packets with given precedence value
        /// </summary>
        public readonly string? Precedence;
        /// <summary>
        /// Match on the PSH bit
        /// </summary>
        public readonly bool? Psh;
        /// <summary>
        /// Access list entry comment
        /// </summary>
        public readonly string? Remark;
        /// <summary>
        /// Match on the RST bit
        /// </summary>
        public readonly bool? Rst;
        /// <summary>
        /// - Range: `1`-`2147483647`
        /// </summary>
        public readonly int Sequence;
        /// <summary>
        /// Service object group name
        /// </summary>
        public readonly string? ServiceObjectGroup;
        /// <summary>
        /// Any source host
        /// </summary>
        public readonly bool? SourceAny;
        /// <summary>
        /// A single source host
        /// </summary>
        public readonly string? SourceHost;
        /// <summary>
        /// Source network object group
        /// </summary>
        public readonly string? SourceObjectGroup;
        /// <summary>
        /// Match only packets on a given port number up to 10 ports
        /// </summary>
        public readonly string? SourcePortEqual;
        /// <summary>
        /// Match only packets with a greater port number
        /// </summary>
        public readonly string? SourcePortGreaterThan;
        /// <summary>
        /// Match only packets with a lower port number
        /// </summary>
        public readonly string? SourcePortLesserThan;
        /// <summary>
        /// Match only packets in the range of port numbers
        /// </summary>
        public readonly string? SourcePortRangeFrom;
        /// <summary>
        /// Match only packets in the range of port numbers
        /// </summary>
        public readonly string? SourcePortRangeTo;
        public readonly string? SourcePrefix;
        public readonly string? SourcePrefixMask;
        /// <summary>
        /// Match on the SYN bit
        /// </summary>
        public readonly bool? Syn;
        /// <summary>
        /// Match packets with given TOS value
        /// </summary>
        public readonly string? Tos;
        /// <summary>
        /// Match on the URG bit
        /// </summary>
        public readonly bool? Urg;

        [OutputConstructor]
        private AccessListExtendedEntry(
            string? aceRuleAction,

            string? aceRuleProtocol,

            bool? ack,

            bool? destinationAny,

            string? destinationHost,

            string? destinationObjectGroup,

            string? destinationPortEqual,

            string? destinationPortGreaterThan,

            string? destinationPortLesserThan,

            string? destinationPortRangeFrom,

            string? destinationPortRangeTo,

            string? destinationPrefix,

            string? destinationPrefixMask,

            string? dscp,

            bool? established,

            bool? fin,

            bool? fragments,

            bool? log,

            bool? logInput,

            string? precedence,

            bool? psh,

            string? remark,

            bool? rst,

            int sequence,

            string? serviceObjectGroup,

            bool? sourceAny,

            string? sourceHost,

            string? sourceObjectGroup,

            string? sourcePortEqual,

            string? sourcePortGreaterThan,

            string? sourcePortLesserThan,

            string? sourcePortRangeFrom,

            string? sourcePortRangeTo,

            string? sourcePrefix,

            string? sourcePrefixMask,

            bool? syn,

            string? tos,

            bool? urg)
        {
            AceRuleAction = aceRuleAction;
            AceRuleProtocol = aceRuleProtocol;
            Ack = ack;
            DestinationAny = destinationAny;
            DestinationHost = destinationHost;
            DestinationObjectGroup = destinationObjectGroup;
            DestinationPortEqual = destinationPortEqual;
            DestinationPortGreaterThan = destinationPortGreaterThan;
            DestinationPortLesserThan = destinationPortLesserThan;
            DestinationPortRangeFrom = destinationPortRangeFrom;
            DestinationPortRangeTo = destinationPortRangeTo;
            DestinationPrefix = destinationPrefix;
            DestinationPrefixMask = destinationPrefixMask;
            Dscp = dscp;
            Established = established;
            Fin = fin;
            Fragments = fragments;
            Log = log;
            LogInput = logInput;
            Precedence = precedence;
            Psh = psh;
            Remark = remark;
            Rst = rst;
            Sequence = sequence;
            ServiceObjectGroup = serviceObjectGroup;
            SourceAny = sourceAny;
            SourceHost = sourceHost;
            SourceObjectGroup = sourceObjectGroup;
            SourcePortEqual = sourcePortEqual;
            SourcePortGreaterThan = sourcePortGreaterThan;
            SourcePortLesserThan = sourcePortLesserThan;
            SourcePortRangeFrom = sourcePortRangeFrom;
            SourcePortRangeTo = sourcePortRangeTo;
            SourcePrefix = sourcePrefix;
            SourcePrefixMask = sourcePrefixMask;
            Syn = syn;
            Tos = tos;
            Urg = urg;
        }
    }
}