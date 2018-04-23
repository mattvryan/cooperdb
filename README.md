# cooperdb


# Introduction

This repository contains the CooperDB database specification and reference implementation.

This database is named for [D. B. Cooper](#DBCooper), who was able to ransom a large quantity of money, and escape to an unknown fate.

CooperDB is a database which solves all three of the problems of [CAP theorem](#CAP). It is able to solve these in real time, across latent network gaps, with eleven-nines of availability, and be completely partition tolerant.

High level features of CooperDB:

* Easily and infinitely horizontally scalable
* Fully partition-tolerant
* Highly available
* Immediately consistent
* ACID and BASE compliant
* Transactional integrity - without transactions
* Immune to deadlocks
* Share-nothing architecture
* Each node is completely stateless

Any implementation of the CooperDB API _MUST_ meet all of the above features.

# Conventions and Terminology

The key words _MUST_, _MUST NOT_, _REQUIRED_, _SHALL_, _SHALL NOT_, _SHOULD_, _SHOULD NOT_, _RECOMMENDED_, _MAY_, and _OPTIONAL_ in this document are to be interpreted as described in [RFC 2119](#RFC2119).

The key words _MUST (BUT WE KNOW YOU WON'T)_, _SHOULD CONSIDER_, _REALLY SHOULD NOT_, _OUGHT TO_, _WOULD PROBABLY_, _MAY WISH TO_, _COULD_, _POSSIBLE_, and _MIGHT_ in this document are to be interpreted as described in [RFC 6919](#RFC6919).

# How does it work?

CooperDB is able to provide a rich feature set in very few lines of code. It uses technology capabilities of today, without needing to consider quantum entaglement.

When leveraging CooperDB, you _SHOULD CONSIDER_ the power of the /dev/null model that it follows, enabling you to literally store any content in it, and never be able to retrieve it again.

When leveraging an implementation of CooperDB, you _MAY WISH TO_ store arbitrary payloads inside Cooper DB. This is a perfect usage of CooperDB. You _REALLY SHOULD NOT_ consider retrieving content from CooperDB, as CooperDB implementations _MUST_ return null for any request to meet all three guarantees of CAP.

You _MAY WISH TO_ consider that Cooper DB is idealy named for [D. B. Cooper](#DBCooper) for this very reason. It can accept any payload you send it, and send them to an unknown fate.

# Informative References

* <a id="DBCooper">[D. B. Cooper](https://en.wikipedia.org/wiki/D._B._Cooper) Wikipedia: D. B. Cooper </a>
* <a id="CAP">[CAP Theorem](https://en.wikipedia.org/wiki/CAP_theorem) Wikipedia: CAP Theorem </a>

# Normative References

* <a id="RFC2119">[RFC2119](https://tools.ietf.org/html/rfc2119) Key words for use in RFCs to Indicate Requirement Levels </a>
* <a id="RFC2119">[RFC2119](https://tools.ietf.org/html/rfc2119) Key words for use in RFCs to Indicate Requirement Levels </a>
