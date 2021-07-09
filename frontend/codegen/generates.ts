import { useQuery, UseQueryOptions } from 'react-query';
import { fetcher } from './fetcher';
export type Maybe<T> = T | null;
export type Exact<T extends { [key: string]: unknown }> = { [K in keyof T]: T[K] };
export type MakeOptional<T, K extends keyof T> = Omit<T, K> & { [SubKey in K]?: Maybe<T[SubKey]> };
export type MakeMaybe<T, K extends keyof T> = Omit<T, K> & { [SubKey in K]: Maybe<T[SubKey]> };
/** All built-in and custom scalars, mapped to their actual values */
export type Scalars = {
  ID: string;
  String: string;
  Boolean: boolean;
  Int: number;
  Float: number;
  /** The 'Long' scalar type represents non-fractional signed whole numeric values. Long can represent values between -(2^64) and 2^64 - 1. */
  Long: any;
};


/** The type that query operations will be rooted at. */
export type QueryType = {
  __typename?: 'QueryType';
  /** All supervisors visible to the ngo assiged to the token */
  lookup: Lookup;
};


/** The type that query operations will be rooted at. */
export type QueryTypeLookupArgs = {
  token: Scalars['String'];
};

/** All supervisors visible to the ngo assiged to the token */
export type Lookup = {
  __typename?: 'lookup';
  /** Self descriptive. */
  ngo: Ngo;
  /** Self descriptive. */
  supervisors: Array<Supervisors>;
};

/** Details of a ngo */
export type Ngo = {
  __typename?: 'ngo';
  name?: Maybe<Scalars['String']>;
};

/** All supervisor visible with the used credentials */
export type Supervisors = {
  __typename?: 'supervisors';
  email?: Maybe<Scalars['String']>;
  login?: Maybe<Scalars['String']>;
  name_full?: Maybe<Scalars['String']>;
  languages?: Maybe<Scalars['String']>;
  offers?: Maybe<Scalars['String']>;
  photo?: Maybe<Scalars['String']>;
  text?: Maybe<Scalars['String']>;
};

export type LookupQueryVariables = Exact<{
  token?: Maybe<Scalars['String']>;
}>;


export type LookupQuery = (
  { __typename?: 'QueryType' }
  & { lookup: (
    { __typename?: 'lookup' }
    & { ngo: (
      { __typename?: 'ngo' }
      & Pick<Ngo, 'name'>
    ), supervisors: Array<(
      { __typename?: 'supervisors' }
      & Pick<Supervisors, 'name_full' | 'email' | 'text'>
    )> }
  ) }
);


export const LookupDocument = `
    query Lookup($token: String = "R4nd0m") {
  lookup(token: $token) {
    ngo {
      name
    }
    supervisors {
      name_full
      email
      text
    }
  }
}
    `;
export const useLookupQuery = <
      TData = LookupQuery,
      TError = unknown
    >(
      variables?: LookupQueryVariables, 
      options?: UseQueryOptions<LookupQuery, TError, TData>
    ) => 
    useQuery<LookupQuery, TError, TData>(
      ['Lookup', variables],
      fetcher<LookupQuery, LookupQueryVariables>(LookupDocument, variables),
      options
    );