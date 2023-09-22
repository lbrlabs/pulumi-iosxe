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
    public sealed class GetRouteMapEntryResult
    {
        /// <summary>
        /// Continue on a different entry within the route-map
        /// </summary>
        public readonly bool Continue;
        /// <summary>
        /// Route-map entry sequence number
        /// </summary>
        public readonly int ContinueSequenceNumber;
        /// <summary>
        /// Route-map comment
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// AS path access-list
        /// </summary>
        public readonly ImmutableArray<int> MatchAsPaths;
        /// <summary>
        /// AS path access-list (DEPRECATED - please use route-map configuration in Cisco-IOS-XE-bgp.yang)
        /// </summary>
        public readonly ImmutableArray<int> MatchAsPathsLegacies;
        /// <summary>
        /// Do exact matching of communities
        /// </summary>
        public readonly bool MatchCommunityListExactMatch;
        /// <summary>
        /// Named Access List
        /// </summary>
        public readonly ImmutableArray<string> MatchCommunityLists;
        /// <summary>
        /// Named Access List (DEPRECATED- please use community-list in Cisco-IOS-XE-bgp.yang)
        /// </summary>
        public readonly ImmutableArray<string> MatchCommunityListsLegacies;
        /// <summary>
        /// Named Access List
        /// </summary>
        public readonly ImmutableArray<string> MatchExtcommunityLists;
        /// <summary>
        /// Named Access List (DEPRECATED- please use extcommunity-list in Cisco-IOS-XE-bgp.yang)
        /// </summary>
        public readonly ImmutableArray<string> MatchExtcommunityListsLegacies;
        public readonly ImmutableArray<string> MatchInterfaces;
        public readonly ImmutableArray<string> MatchIpAddressAccessLists;
        /// <summary>
        /// Match entries of prefix-lists
        /// </summary>
        public readonly ImmutableArray<string> MatchIpAddressPrefixLists;
        public readonly ImmutableArray<string> MatchIpNextHopAccessLists;
        /// <summary>
        /// Match entries of prefix-lists
        /// </summary>
        public readonly ImmutableArray<string> MatchIpNextHopPrefixLists;
        public readonly string MatchIpv6AddressAccessLists;
        /// <summary>
        /// IPv6 prefix-list
        /// </summary>
        public readonly string MatchIpv6AddressPrefixLists;
        public readonly string MatchIpv6NextHopAccessLists;
        /// <summary>
        /// IPv6 prefix-list
        /// </summary>
        public readonly string MatchIpv6NextHopPrefixLists;
        public readonly ImmutableArray<int> MatchLocalPreferences;
        public readonly ImmutableArray<int> MatchLocalPreferencesLegacies;
        /// <summary>
        /// external route (BGP, EIGRP and OSPF type 1/2)
        /// </summary>
        public readonly bool MatchRouteTypeExternal;
        /// <summary>
        /// OSPF external type 1 route
        /// </summary>
        public readonly bool MatchRouteTypeExternalType1;
        /// <summary>
        /// OSPF external type 2 route
        /// </summary>
        public readonly bool MatchRouteTypeExternalType2;
        /// <summary>
        /// internal route (including OSPF intra/inter area)
        /// </summary>
        public readonly bool MatchRouteTypeInternal;
        /// <summary>
        /// IS-IS level-1 route
        /// </summary>
        public readonly bool MatchRouteTypeLevel1;
        /// <summary>
        /// IS-IS level-2 route
        /// </summary>
        public readonly bool MatchRouteTypeLevel2;
        /// <summary>
        /// locally generated route (DEPRECATED - please use route-map configuration in Cisco-IOS-XE-bgp.yang)
        /// </summary>
        public readonly bool MatchRouteTypeLocal;
        /// <summary>
        /// Border Gateway Protocol (BGP)
        /// </summary>
        public readonly ImmutableArray<string> MatchSourceProtocolBgps;
        /// <summary>
        /// Connected
        /// </summary>
        public readonly bool MatchSourceProtocolConnected;
        /// <summary>
        /// Border Gateway Protocol (BGP)
        /// </summary>
        public readonly ImmutableArray<string> MatchSourceProtocolEigrps;
        /// <summary>
        /// ISO IS-IS
        /// </summary>
        public readonly bool MatchSourceProtocolIsis;
        /// <summary>
        /// Locator ID Separation Protocol (LISP)
        /// </summary>
        public readonly bool MatchSourceProtocolLisp;
        /// <summary>
        /// Open Shortest Path First (OSPF)
        /// </summary>
        public readonly ImmutableArray<string> MatchSourceProtocolOspfs;
        /// <summary>
        /// OSPFv3
        /// </summary>
        public readonly ImmutableArray<string> MatchSourceProtocolOspfv3s;
        /// <summary>
        /// Routing Information Protocol (RIP)
        /// </summary>
        public readonly bool MatchSourceProtocolRip;
        /// <summary>
        /// Static routes
        /// </summary>
        public readonly bool MatchSourceProtocolStatic;
        /// <summary>
        /// Tag value
        /// </summary>
        public readonly ImmutableArray<int> MatchTags;
        /// <summary>
        /// tracking object
        /// </summary>
        public readonly int MatchTrack;
        public readonly string Operation;
        public readonly int Seq;
        /// <summary>
        /// \n\n;;AS number
        /// </summary>
        public readonly string SetAsPathPrependAs;
        /// <summary>
        /// \n\n;;AS number (DEPRECATED - please use route-map configuration in Cisco-IOS-XE-bgp.yang)
        /// </summary>
        public readonly string SetAsPathPrependAsLegacy;
        public readonly int SetAsPathPrependLastAs;
        public readonly int SetAsPathPrependLastAsLegacy;
        /// <summary>
        /// Set the tag as an AS-path attribute
        /// </summary>
        public readonly bool SetAsPathTag;
        /// <summary>
        /// Set the tag as an AS-path attribute (DEPRECATED - please use route-map configuration in Cisco-IOS-XE-bgp.yang)
        /// </summary>
        public readonly bool SetAsPathTagLegacy;
        public readonly ImmutableArray<string> SetCommunities;
        public readonly bool SetCommunitiesAdditive;
        public readonly bool SetCommunitiesAdditiveLegacy;
        public readonly ImmutableArray<string> SetCommunitiesLegacies;
        /// <summary>
        /// Delete matching communities
        /// </summary>
        public readonly bool SetCommunityListDelete;
        /// <summary>
        /// Delete matching communities (DEPRECATED - please use route-map configuration in Cisco-IOS-XE-bgp.yang)
        /// </summary>
        public readonly bool SetCommunityListDeleteLegacy;
        public readonly int SetCommunityListExpanded;
        public readonly int SetCommunityListExpandedLegacy;
        public readonly string SetCommunityListName;
        public readonly string SetCommunityListNameLegacy;
        public readonly int SetCommunityListStandard;
        public readonly int SetCommunityListStandardLegacy;
        /// <summary>
        /// No community attribute
        /// </summary>
        public readonly bool SetCommunityNone;
        /// <summary>
        /// No community attribute (DEPRECATED - please use route-map configuration in Cisco-IOS-XE-bgp.yang)
        /// </summary>
        public readonly bool SetCommunityNoneLegacy;
        /// <summary>
        /// SPAN source interface
        /// </summary>
        public readonly ImmutableArray<string> SetDefaultInterfaces;
        public readonly ImmutableArray<string> SetExtcomunityRtLegacies;
        public readonly ImmutableArray<string> SetExtcomunityRts;
        public readonly string SetExtcomunitySoo;
        public readonly string SetExtcomunitySooLegacy;
        /// <summary>
        /// VPN Distinguisher Extended Community
        /// </summary>
        public readonly string SetExtcomunityVpnDistinguisher;
        public readonly bool SetExtcomunityVpnDistinguisherAdditive;
        public readonly string SetExtcomunityVpnDistinguisherLegacy;
        public readonly bool SetGlobal;
        /// <summary>
        /// Interface specific information
        /// </summary>
        public readonly ImmutableArray<string> SetInterfaces;
        /// <summary>
        /// Specify prefix-list
        /// </summary>
        public readonly string SetIpAddress;
        public readonly ImmutableArray<string> SetIpDefaultGlobalNextHopAddresses;
        public readonly ImmutableArray<string> SetIpDefaultNextHopAddresses;
        public readonly ImmutableArray<string> SetIpGlobalNextHopAddresses;
        public readonly ImmutableArray<string> SetIpNextHopAddresses;
        /// <summary>
        /// Use self address (for BGP only)
        /// </summary>
        public readonly bool SetIpNextHopSelf;
        public readonly int SetIpQosGroup;
        /// <summary>
        /// IPv6 prefix-list
        /// </summary>
        public readonly ImmutableArray<string> SetIpv6Addresses;
        /// <summary>
        /// Next hop along path
        /// </summary>
        public readonly string SetIpv6DefaultGlobalNextHop;
        /// <summary>
        /// Default next hop IPv6 address
        /// </summary>
        public readonly ImmutableArray<string> SetIpv6DefaultNextHops;
        /// <summary>
        /// Next hop IPv6 address
        /// </summary>
        public readonly ImmutableArray<string> SetIpv6NextHops;
        /// <summary>
        /// Import into a level-1 area
        /// </summary>
        public readonly bool SetLevel1;
        /// <summary>
        /// Import into level-1 and level-2
        /// </summary>
        public readonly bool SetLevel12;
        /// <summary>
        /// Import into level-2 sub-domain
        /// </summary>
        public readonly bool SetLevel2;
        /// <summary>
        /// Preference value
        /// </summary>
        public readonly int SetLocalPreference;
        /// <summary>
        /// Preference value (DEPRECATED - please use route-map configuration in Cisco-IOS-XE-bgp.yang)
        /// </summary>
        public readonly int SetLocalPreferenceLegacy;
        /// <summary>
        /// +/-\n\n;;Add or subtract metric
        /// </summary>
        public readonly string SetMetricChange;
        /// <summary>
        /// EIGRP delay metric, in 10 microsecond units
        /// </summary>
        public readonly string SetMetricDelay;
        /// <summary>
        /// EIGRP Effective bandwidth metric (Loading) where 255 is 100% loaded
        /// </summary>
        public readonly int SetMetricLoading;
        /// <summary>
        /// EIGRP MTU of the path
        /// </summary>
        public readonly int SetMetricMtu;
        /// <summary>
        /// EIGRP reliability metric where 255 is 100% reliable
        /// </summary>
        public readonly int SetMetricReliability;
        /// <summary>
        /// Type of metric for destination routing protocol
        /// </summary>
        public readonly string SetMetricType;
        /// <summary>
        /// Metric value or Bandwidth in Kbits per second
        /// </summary>
        public readonly int SetMetricValue;
        /// <summary>
        /// Tag value
        /// </summary>
        public readonly int SetTag;
        /// <summary>
        /// VPN Routing/Forwarding instance name
        /// </summary>
        public readonly string SetVrf;
        /// <summary>
        /// BGP weight for routing table
        /// </summary>
        public readonly int SetWeight;
        /// <summary>
        /// BGP weight for routing table (DEPRECATED - please use route-map configuration in Cisco-IOS-XE-bgp.yang)
        /// </summary>
        public readonly int SetWeightLegacy;

        [OutputConstructor]
        private GetRouteMapEntryResult(
            bool @continue,

            int continueSequenceNumber,

            string description,

            ImmutableArray<int> matchAsPaths,

            ImmutableArray<int> matchAsPathsLegacies,

            bool matchCommunityListExactMatch,

            ImmutableArray<string> matchCommunityLists,

            ImmutableArray<string> matchCommunityListsLegacies,

            ImmutableArray<string> matchExtcommunityLists,

            ImmutableArray<string> matchExtcommunityListsLegacies,

            ImmutableArray<string> matchInterfaces,

            ImmutableArray<string> matchIpAddressAccessLists,

            ImmutableArray<string> matchIpAddressPrefixLists,

            ImmutableArray<string> matchIpNextHopAccessLists,

            ImmutableArray<string> matchIpNextHopPrefixLists,

            string matchIpv6AddressAccessLists,

            string matchIpv6AddressPrefixLists,

            string matchIpv6NextHopAccessLists,

            string matchIpv6NextHopPrefixLists,

            ImmutableArray<int> matchLocalPreferences,

            ImmutableArray<int> matchLocalPreferencesLegacies,

            bool matchRouteTypeExternal,

            bool matchRouteTypeExternalType1,

            bool matchRouteTypeExternalType2,

            bool matchRouteTypeInternal,

            bool matchRouteTypeLevel1,

            bool matchRouteTypeLevel2,

            bool matchRouteTypeLocal,

            ImmutableArray<string> matchSourceProtocolBgps,

            bool matchSourceProtocolConnected,

            ImmutableArray<string> matchSourceProtocolEigrps,

            bool matchSourceProtocolIsis,

            bool matchSourceProtocolLisp,

            ImmutableArray<string> matchSourceProtocolOspfs,

            ImmutableArray<string> matchSourceProtocolOspfv3s,

            bool matchSourceProtocolRip,

            bool matchSourceProtocolStatic,

            ImmutableArray<int> matchTags,

            int matchTrack,

            string operation,

            int seq,

            string setAsPathPrependAs,

            string setAsPathPrependAsLegacy,

            int setAsPathPrependLastAs,

            int setAsPathPrependLastAsLegacy,

            bool setAsPathTag,

            bool setAsPathTagLegacy,

            ImmutableArray<string> setCommunities,

            bool setCommunitiesAdditive,

            bool setCommunitiesAdditiveLegacy,

            ImmutableArray<string> setCommunitiesLegacies,

            bool setCommunityListDelete,

            bool setCommunityListDeleteLegacy,

            int setCommunityListExpanded,

            int setCommunityListExpandedLegacy,

            string setCommunityListName,

            string setCommunityListNameLegacy,

            int setCommunityListStandard,

            int setCommunityListStandardLegacy,

            bool setCommunityNone,

            bool setCommunityNoneLegacy,

            ImmutableArray<string> setDefaultInterfaces,

            ImmutableArray<string> setExtcomunityRtLegacies,

            ImmutableArray<string> setExtcomunityRts,

            string setExtcomunitySoo,

            string setExtcomunitySooLegacy,

            string setExtcomunityVpnDistinguisher,

            bool setExtcomunityVpnDistinguisherAdditive,

            string setExtcomunityVpnDistinguisherLegacy,

            bool setGlobal,

            ImmutableArray<string> setInterfaces,

            string setIpAddress,

            ImmutableArray<string> setIpDefaultGlobalNextHopAddresses,

            ImmutableArray<string> setIpDefaultNextHopAddresses,

            ImmutableArray<string> setIpGlobalNextHopAddresses,

            ImmutableArray<string> setIpNextHopAddresses,

            bool setIpNextHopSelf,

            int setIpQosGroup,

            ImmutableArray<string> setIpv6Addresses,

            string setIpv6DefaultGlobalNextHop,

            ImmutableArray<string> setIpv6DefaultNextHops,

            ImmutableArray<string> setIpv6NextHops,

            bool setLevel1,

            bool setLevel12,

            bool setLevel2,

            int setLocalPreference,

            int setLocalPreferenceLegacy,

            string setMetricChange,

            string setMetricDelay,

            int setMetricLoading,

            int setMetricMtu,

            int setMetricReliability,

            string setMetricType,

            int setMetricValue,

            int setTag,

            string setVrf,

            int setWeight,

            int setWeightLegacy)
        {
            Continue = @continue;
            ContinueSequenceNumber = continueSequenceNumber;
            Description = description;
            MatchAsPaths = matchAsPaths;
            MatchAsPathsLegacies = matchAsPathsLegacies;
            MatchCommunityListExactMatch = matchCommunityListExactMatch;
            MatchCommunityLists = matchCommunityLists;
            MatchCommunityListsLegacies = matchCommunityListsLegacies;
            MatchExtcommunityLists = matchExtcommunityLists;
            MatchExtcommunityListsLegacies = matchExtcommunityListsLegacies;
            MatchInterfaces = matchInterfaces;
            MatchIpAddressAccessLists = matchIpAddressAccessLists;
            MatchIpAddressPrefixLists = matchIpAddressPrefixLists;
            MatchIpNextHopAccessLists = matchIpNextHopAccessLists;
            MatchIpNextHopPrefixLists = matchIpNextHopPrefixLists;
            MatchIpv6AddressAccessLists = matchIpv6AddressAccessLists;
            MatchIpv6AddressPrefixLists = matchIpv6AddressPrefixLists;
            MatchIpv6NextHopAccessLists = matchIpv6NextHopAccessLists;
            MatchIpv6NextHopPrefixLists = matchIpv6NextHopPrefixLists;
            MatchLocalPreferences = matchLocalPreferences;
            MatchLocalPreferencesLegacies = matchLocalPreferencesLegacies;
            MatchRouteTypeExternal = matchRouteTypeExternal;
            MatchRouteTypeExternalType1 = matchRouteTypeExternalType1;
            MatchRouteTypeExternalType2 = matchRouteTypeExternalType2;
            MatchRouteTypeInternal = matchRouteTypeInternal;
            MatchRouteTypeLevel1 = matchRouteTypeLevel1;
            MatchRouteTypeLevel2 = matchRouteTypeLevel2;
            MatchRouteTypeLocal = matchRouteTypeLocal;
            MatchSourceProtocolBgps = matchSourceProtocolBgps;
            MatchSourceProtocolConnected = matchSourceProtocolConnected;
            MatchSourceProtocolEigrps = matchSourceProtocolEigrps;
            MatchSourceProtocolIsis = matchSourceProtocolIsis;
            MatchSourceProtocolLisp = matchSourceProtocolLisp;
            MatchSourceProtocolOspfs = matchSourceProtocolOspfs;
            MatchSourceProtocolOspfv3s = matchSourceProtocolOspfv3s;
            MatchSourceProtocolRip = matchSourceProtocolRip;
            MatchSourceProtocolStatic = matchSourceProtocolStatic;
            MatchTags = matchTags;
            MatchTrack = matchTrack;
            Operation = operation;
            Seq = seq;
            SetAsPathPrependAs = setAsPathPrependAs;
            SetAsPathPrependAsLegacy = setAsPathPrependAsLegacy;
            SetAsPathPrependLastAs = setAsPathPrependLastAs;
            SetAsPathPrependLastAsLegacy = setAsPathPrependLastAsLegacy;
            SetAsPathTag = setAsPathTag;
            SetAsPathTagLegacy = setAsPathTagLegacy;
            SetCommunities = setCommunities;
            SetCommunitiesAdditive = setCommunitiesAdditive;
            SetCommunitiesAdditiveLegacy = setCommunitiesAdditiveLegacy;
            SetCommunitiesLegacies = setCommunitiesLegacies;
            SetCommunityListDelete = setCommunityListDelete;
            SetCommunityListDeleteLegacy = setCommunityListDeleteLegacy;
            SetCommunityListExpanded = setCommunityListExpanded;
            SetCommunityListExpandedLegacy = setCommunityListExpandedLegacy;
            SetCommunityListName = setCommunityListName;
            SetCommunityListNameLegacy = setCommunityListNameLegacy;
            SetCommunityListStandard = setCommunityListStandard;
            SetCommunityListStandardLegacy = setCommunityListStandardLegacy;
            SetCommunityNone = setCommunityNone;
            SetCommunityNoneLegacy = setCommunityNoneLegacy;
            SetDefaultInterfaces = setDefaultInterfaces;
            SetExtcomunityRtLegacies = setExtcomunityRtLegacies;
            SetExtcomunityRts = setExtcomunityRts;
            SetExtcomunitySoo = setExtcomunitySoo;
            SetExtcomunitySooLegacy = setExtcomunitySooLegacy;
            SetExtcomunityVpnDistinguisher = setExtcomunityVpnDistinguisher;
            SetExtcomunityVpnDistinguisherAdditive = setExtcomunityVpnDistinguisherAdditive;
            SetExtcomunityVpnDistinguisherLegacy = setExtcomunityVpnDistinguisherLegacy;
            SetGlobal = setGlobal;
            SetInterfaces = setInterfaces;
            SetIpAddress = setIpAddress;
            SetIpDefaultGlobalNextHopAddresses = setIpDefaultGlobalNextHopAddresses;
            SetIpDefaultNextHopAddresses = setIpDefaultNextHopAddresses;
            SetIpGlobalNextHopAddresses = setIpGlobalNextHopAddresses;
            SetIpNextHopAddresses = setIpNextHopAddresses;
            SetIpNextHopSelf = setIpNextHopSelf;
            SetIpQosGroup = setIpQosGroup;
            SetIpv6Addresses = setIpv6Addresses;
            SetIpv6DefaultGlobalNextHop = setIpv6DefaultGlobalNextHop;
            SetIpv6DefaultNextHops = setIpv6DefaultNextHops;
            SetIpv6NextHops = setIpv6NextHops;
            SetLevel1 = setLevel1;
            SetLevel12 = setLevel12;
            SetLevel2 = setLevel2;
            SetLocalPreference = setLocalPreference;
            SetLocalPreferenceLegacy = setLocalPreferenceLegacy;
            SetMetricChange = setMetricChange;
            SetMetricDelay = setMetricDelay;
            SetMetricLoading = setMetricLoading;
            SetMetricMtu = setMetricMtu;
            SetMetricReliability = setMetricReliability;
            SetMetricType = setMetricType;
            SetMetricValue = setMetricValue;
            SetTag = setTag;
            SetVrf = setVrf;
            SetWeight = setWeight;
            SetWeightLegacy = setWeightLegacy;
        }
    }
}